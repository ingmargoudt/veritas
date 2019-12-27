package io.github.ingmargoudt.veritas.assertions;

public class BooleanAssertion extends AbstractAssertion<BooleanAssertion, Boolean>  {

    public BooleanAssertion(Boolean actual) {
        super(actual);
    }

    public BooleanAssertion isTrue(){
        checkIfActualNull();
        if (actual) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be true, ", actual);
    }

    public BooleanAssertion isFalse(){
        checkIfActualNull();
        if (!actual) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be false, ", actual);
    }
}
