package io.github.ingmargoudt.veritas.assertions;

import java.util.logging.Logger;

public class LongAssertion extends AbstractAssertion<LongAssertion, Long> implements NumericAssertable<LongAssertion, Long> {

    private static final Logger logger = Logger.getLogger("LongAssertion");

    public LongAssertion(Long actual) {
        super(actual);
    }

    public LongAssertion isEven() {
        return test(n -> n % 2 == 0, "Expected %s to be even, ", actual);
    }

    public LongAssertion isOdd() {
        return test(actual -> actual % 2 != 0, "Expected %s to be odd ", actual);
    }

    public LongAssertion isSmallerThan(Long target) {
        if (target == null) {
            throw new NullPointerException("b can not be null in a < b");
        }
        return test(actual -> actual < target, "Expected %s to be smaller than %s ", actual, target);
    }

    public LongAssertion isSmallerThanOrEqual(Long target) {
        if (target == null) {
            throw new NullPointerException("b can not be null in a <= b");
        }
        return test(actual -> actual <= target, "Expected %s to be smaller than or equal to %s ", actual, target);
    }

    public LongAssertion isGreaterThan(Long target) {
        if (target == null) {
            throw new NullPointerException("b can not be null in a > b");
        }
        return test(actual -> actual > target, "Expected %s to be greater than %s ", actual, target);
    }

    public LongAssertion isGreaterThanOrEqual(Long target) {
        if (target == null) {
            throw new NullPointerException("b can not be null in a >= b");
        }
        return test(actual -> actual >= target, "Expected %s to be greater than or equal to %s ", actual, target);
    }

    public LongAssertion isBetween(Long lower, Long upper) {
        if (lower == null) {
            throw new NullPointerException("Lower bound can not be null");
        }
        if (upper == null) {
            throw new NullPointerException("Upper bound can not be null");
        }
        return test (actual ->actual >= lower && actual <= upper, "Expected %s to be between %s ", actual, lower, upper);
    }

    public LongAssertion isMultipleOf(Integer multiplicant) {
        if (multiplicant == null) {
            throw new NullPointerException("multiplicant can not be null");
        }
        return test (actual ->actual % multiplicant == 0,"Expected %s to be a multiple of %s ", actual, multiplicant);
    }
}
