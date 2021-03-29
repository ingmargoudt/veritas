package io.github.ingmargoudt.veritas.assertions.primitives;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;
import io.github.ingmargoudt.veritas.assertions.NumericAssertable;

public class DoubleAssertion extends AbstractAssertion<DoubleAssertion, Double> implements NumericAssertable<DoubleAssertion, Double> {

    public DoubleAssertion(Double actual) {
        super(actual);
    }

    @Override
    public DoubleAssertion isSmallerThan(Double target) {
        return test(actual -> Double.compare(actual, target) < 0, "double %s was not smaller than %s", actual, target);

    }

    @Override
    public DoubleAssertion isSmallerThanOrEqual(Double target) {

        return test(actual -> Double.compare(actual, target) <= 0, "double %s was not smaller than or equal to %s", actual, target);

    }

    @Override
    public DoubleAssertion isGreaterThan(Double target) {

        return test(actual -> Double.compare(actual, target) > 0, "double %s was not greater than %s", actual, target);

    }

    @Override
    public DoubleAssertion isGreaterThanOrEqual(Double target) {

        return test(actual -> Double.compare(actual, target) >= 0, "double %s was not greater than or equal to %s", actual, target);

    }

    @Override
    public DoubleAssertion isBetween(Double lower, Double upper) {
        throwIfNull(lower, "in a <= x <= b, a can not be null");
        throwIfNull(upper, "in a <= x <= b, b can not be null");
        return test(actual -> Double.compare(actual, lower) >= 0 && Double.compare(actual, upper) <= 0, "Expected %s to be between %s and %s", actual, lower, upper);
    }
}


