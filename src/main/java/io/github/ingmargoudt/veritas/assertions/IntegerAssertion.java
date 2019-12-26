package io.github.ingmargoudt.veritas.assertions;

import java.util.logging.Logger;

public class IntegerAssertion extends AbstractAssertion<IntegerAssertion, Integer> implements NumericAssertable<IntegerAssertion, Integer> {

    private static final Logger logger = Logger.getLogger("IntAssertion");

    public IntegerAssertion(int actual) {
        super(actual);
    }

    public IntegerAssertion isEven() {
        if (actual % 2 == 0) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be even, ", actual);
    }

    public IntegerAssertion isOdd() {
        if (actual % 2 != 0) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be odd ", actual);
    }

    public IntegerAssertion isSmallerThan(Integer target) {
        if (actual < target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be smaller than %s ", actual, target);
    }

    public IntegerAssertion isSmallerThanOrEqual(Integer target) {
        if (actual <= target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be smaller than or equal to %s ", actual, target);
    }

    public IntegerAssertion isGreaterThan(Integer target) {
        if (actual > target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be greater than %s ", actual, target);
    }

    public IntegerAssertion isGreaterThanOrEqual(Integer target) {
        if (actual >= target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be greater than or equal to %s ", actual, target);
    }

    public IntegerAssertion isBetween(Integer lower, Integer upper) {
        if (actual >= lower && actual <= upper) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be between %s ", actual, lower, upper);
    }

    public IntegerAssertion isMultipleOf(Integer multiplicant) {
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
