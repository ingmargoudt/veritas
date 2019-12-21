package io.github.ingmargoudt.tester.assertions;

import io.github.ingmargoudt.tester.Tester;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Assertion {

    private static final Logger logger = Logger.getLogger("Assertion");

    public String getCustomErrorMessage() {
        return customErrorMessage;
    }

    public String getCustomPassMessage() {
        return customPassMessage;
    }

    String customErrorMessage = "";
    String customPassMessage = "";
    protected String failMessage;

    protected final <T> void fail(String failMessage, T... args) {
        if (!customErrorMessage.isEmpty()) {
            throw new AssertionError(customErrorMessage);
        } else {
            logger.log(Level.WARNING, String.format(failMessage, args));
            throw new AssertionError(String.format(failMessage, args));
        }
    }

    protected void reportSuccess() {
        if (Tester.LOG_PASSED && !customPassMessage.isEmpty()) {
            logger.log(Level.INFO, customPassMessage);
        }
    }

}
