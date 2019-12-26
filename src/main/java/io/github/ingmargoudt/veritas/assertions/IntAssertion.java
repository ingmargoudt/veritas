package io.github.ingmargoudt.veritas.assertions;

import java.util.logging.Logger;

public class IntAssertion extends AbstractAssertion<IntAssertion, Integer> implements NumericAssertable<IntAssertion, Integer> {

    private static final Logger logger = Logger.getLogger("IntAssertion");

    public IntAssertion(int obtained) {
        super(obtained);
    }

    public IntAssertion isEven() {
        if (actual % 2 == 0) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be even, ", actual);
    }

    public IntAssertion isOdd() {
        if (actual % 2 != 0) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be odd ", actual);
    }

    public IntAssertion isSmallerThan(Integer target) {
        if (actual < target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be smaller than %s ", actual, target);
    }

    public IntAssertion isSmallerThanOrEqual(Integer target) {
        if (actual <= target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be smaller than or equal to %s ", actual, target);
    }

    public IntAssertion isGreaterThan(Integer target) {
        if (actual > target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be greater than %s ", actual, target);
    }

    public IntAssertion isGreaterThanOrEqual(Integer target) {
        if (actual >= target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be greater than or equal to %s ", actual, target);
    }

    public IntAssertion isBetween(Integer lower, Integer upper) {
        if (actual >= lower && actual <= upper) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be between %s ", actual, lower, upper);
    }

    public IntAssertion isMultipleOf(Integer multiplicant) {
        if (multiplicant == null) {
            throw new NullPointerException("multiplicant can not be null");
        }
        if (actual % multiplicant == 0) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be a multiple of %s ", actual, multiplicant);
    }
}
