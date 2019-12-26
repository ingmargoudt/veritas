package io.github.ingmargoudt.veritas.assertions;

import java.util.logging.Logger;

public class IntegerAssertion extends AbstractAssertion<IntegerAssertion, Integer> implements NumericAssertable<IntegerAssertion, Integer> {

    private static final Logger logger = Logger.getLogger("IntAssertion");

    public IntegerAssertion(Integer actual) {
        super(actual);
    }

    public IntegerAssertion isEven() {
        checkIfActualNull();
        if (actual % 2 == 0) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be even, ", actual);
    }

    public IntegerAssertion isOdd() {
        checkIfActualNull();
        if (actual % 2 != 0) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be odd ", actual);
    }

    public IntegerAssertion isSmallerThan(Integer target) {
        checkIfActualNull();
        if (target == null) {
            throw new NullPointerException("b can not be null in a < b");
        }
        if (actual < target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be smaller than %s ", actual, target);
    }

    public IntegerAssertion isSmallerThanOrEqual(Integer target) {
        checkIfActualNull();
        if (target == null) {
            throw new NullPointerException("b can not be null in a <= b");
        }
        if (actual <= target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be smaller than or equal to %s ", actual, target);
    }

    public IntegerAssertion isGreaterThan(Integer target) {
        checkIfActualNull();
        if (target == null) {
            throw new NullPointerException("b can not be null in a > b");
        }
        if (actual > target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be greater than %s ", actual, target);
    }

    public IntegerAssertion isGreaterThanOrEqual(Integer target) {
        checkIfActualNull();
        if (target == null) {
            throw new NullPointerException("b can not be null in a >= b");
        }
        if (actual >= target) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be greater than or equal to %s ", actual, target);
    }

    public IntegerAssertion isBetween(Integer lower, Integer upper) {
        checkIfActualNull();
        if (lower == null) {
            throw new NullPointerException("Lower bound can not be null");
        }
        if (upper == null) {
            throw new NullPointerException("Upper bound can not be null");
        }
        if (actual >= lower && actual <= upper) {
            reportSuccess();
            return self();
        }
        return fail("Expected %s to be between %s ", actual, lower, upper);
    }

    public IntegerAssertion isMultipleOf(Integer multiplicant) {
        checkIfActualNull();
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
