package io.github.ingmargoudt.veritas.assertions;

import io.github.ingmargoudt.veritas.Veritas;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class AbstractAssertion<
        SELF_TYPE extends AbstractAssertion<SELF_TYPE, ELEMENT_TYPE>,
        ELEMENT_TYPE
        > implements Assertable<SELF_TYPE, ELEMENT_TYPE> {

    private static final Logger logger = Logger.getLogger("Assertion");

    protected final ELEMENT_TYPE actual;


    protected AbstractAssertion(ELEMENT_TYPE actual) {
        this.actual = actual;
    }

    public String getCustomErrorMessage() {
        return customErrorMessage;
    }

    public String getCustomPassMessage() {
        return customPassMessage;
    }

    String customErrorMessage = "";
    String customPassMessage = "";

    protected final <T> SELF_TYPE fail(String failMessage, T... args) {
        if (!customErrorMessage.isEmpty()) {
            throw new AssertionError(customErrorMessage);
        } else {
            logger.log(Level.WARNING, String.format(failMessage, args));
            throw new AssertionError(String.format(failMessage, args));
        }
    }

    protected void reportSuccess() {
        if (Veritas.LOG_PASSED && !customPassMessage.isEmpty()) {
            logger.log(Level.INFO, customPassMessage);
        }
    }

    @SuppressWarnings("unchecked")
    protected final SELF_TYPE self() {
        return (SELF_TYPE) this;
    }

    public SELF_TYPE onSucces(String message) {
        customPassMessage = message;
        return self();
    }

    public SELF_TYPE onFail(String message) {
        customErrorMessage = message;
        return self();
    }

    public SELF_TYPE isEqualTo(ELEMENT_TYPE expected) {
        if (Objects.equals(expected, actual)) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be equal to %s", actual, expected);

    }

    public void checkIfActualNull() {
        if (actual == null) {
            throw new AssertionError("Actual is null");
        }
    }

    public SELF_TYPE isNull(){
        if(actual == null){
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be null", actual);
    }

    public SELF_TYPE isNotNull(){
        if(actual != null){
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be non-null", actual);
    }

    public SELF_TYPE isNotEqualTo(ELEMENT_TYPE expected) {
        if (!Objects.equals(expected, actual)) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be not equal to %s", actual, expected);

    }

    public boolean test(Predicate<ELEMENT_TYPE> predicate){
        if(predicate.test(actual)){
            reportSuccess();
            return true;
        }
        return false;
    }

}
