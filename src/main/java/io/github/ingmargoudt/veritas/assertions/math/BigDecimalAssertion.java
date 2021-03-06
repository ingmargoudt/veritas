package io.github.ingmargoudt.veritas.assertions.math;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;
import io.github.ingmargoudt.veritas.assertions.NumericAssertable;

import java.math.BigDecimal;

public class BigDecimalAssertion extends AbstractAssertion<BigDecimalAssertion, BigDecimal> implements NumericAssertable<BigDecimalAssertion, BigDecimal> {
    
    public BigDecimalAssertion(BigDecimal actual) {
        super(actual);
    }

    @Override
    public BigDecimalAssertion isSmallerThan(BigDecimal target) {
        throwIfNull(target, "in a < b , b can not be null");
        return test(actual -> actual.compareTo(target) < 0, "%s was not smaller than %s", actual, target);
    }

    @Override
    public BigDecimalAssertion isSmallerThanOrEqual(BigDecimal target) {
        throwIfNull(target, "in a <= b , b can not be null");
        return test(actual -> actual.compareTo(target) <= 0, "%s was not smaller than or equal to %s", actual, target);
    }

    @Override
    public BigDecimalAssertion isGreaterThan(BigDecimal target) {
        throwIfNull(target, "in a > b , b can not be null");
        return test(actual -> actual.compareTo(target) > 0, "%s was not greater than %s", actual, target);
    }

    @Override
    public BigDecimalAssertion isGreaterThanOrEqual(BigDecimal target) {
        throwIfNull(target, "in a >= b , b can not be null");
        return test(actual -> actual.compareTo(target) >= 0, "%s was not greater than or equal to %s", actual, target);
    }

    @Override
    public BigDecimalAssertion isBetween(BigDecimal lower, BigDecimal upper) {
        throwIfNull(lower, "Lower bound can not be null");
        throwIfNull(upper, "Upper bound can not be null");
        return test(actual -> actual.compareTo(lower) >= 0 && actual.compareTo(upper) <= 0, "%s is not between %s and %s", actual, lower, upper);
    }

    @Override
    public BigDecimalAssertion isPositive() {
        return test(actual -> actual.compareTo(BigDecimal.ZERO) > 0, "BigDecimal %s expected to be positive",actual);
    }
}