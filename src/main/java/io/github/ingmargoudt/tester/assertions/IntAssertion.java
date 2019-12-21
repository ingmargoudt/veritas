package io.github.ingmargoudt.tester.assertions;

import java.util.logging.Logger;

public class IntAssertion extends Assertion {

    private static final Logger logger = Logger.getLogger("IntAssertion");

    private IntAssertion(int obtained) {
        this.obtained = obtained;
    }

    int obtained;

    public static IntAssertion of(int obtained) {

        return new IntAssertion(obtained);
    }

    public IntAssertion isEqualTo(int expected) {
        if (expected == obtained) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be equal to %s", obtained, expected);
        return this;
    }

    public IntAssertion onSucces(String message) {
        customPassMessage = message;
        return this;
    }

    public IntAssertion onFail(String message) {
        customErrorMessage = message;
        return this;
    }

    public IntAssertion isEven() {
        if (obtained % 2 == 0) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be even, ", obtained);
        return this;
    }

    public IntAssertion isOdd() {
        if (obtained % 2 != 0) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be odd ", obtained);
        return this;
    }

    public IntAssertion isSmallerThan(int target) {
        if (obtained < target) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be smaller than %s ", obtained, target);
        return this;
    }

    public IntAssertion isSmallerThanOrEqual(int target) {
        if (obtained <= target) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be smaller than or equal to %s ", obtained, target);
        return this;
    }

    public IntAssertion isGreaterThan(int target) {
        if (obtained > target) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be greater than %s ", obtained, target);
        return this;
    }

    public IntAssertion isGreaterThanOrEqual(int target) {
        if (obtained >= target) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be greater than or equal to %s ", obtained, target);
        return this;
    }

    public IntAssertion isBetween(int lower, int upper) {
        if (obtained >= lower && obtained <= upper) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be between %s ", obtained, lower, upper);
        return this;
    }

    public IntAssertion isMultipleOf(int multiplicant) {
        if (obtained % multiplicant == 0) {
            reportSuccess();
            return this;
        }
        fail("Expected %s to be a multiple of %s ", obtained, multiplicant);
        return this;
    }
}
