package io.github.ingmargoudt.veritas.assertions;

public class FloatAssertion extends AbstractAssertion<FloatAssertion, Float> implements NumericAssertable<FloatAssertion, Float> {

    public FloatAssertion(Float actual) {
        super(actual);
    }

    @Override
    public FloatAssertion isSmallerThan(Float target) {
        return test(actual -> Float.compare(actual, target) < 0, "Float %s was not smaller than %s", actual, target);

    }

    @Override
    public FloatAssertion isSmallerThanOrEqual(Float target) {

        return test(actual -> Float.compare(actual, target) <= 0, "Float %s was not smaller than or equal to %s", actual, target);

    }

    @Override
    public FloatAssertion isGreaterThan(Float target) {

        return test(actual -> Float.compare(actual, target) > 0, "Float %s was not greater than %s", actual, target);

    }

    @Override
    public FloatAssertion isGreaterThanOrEqual(Float target) {

        return test(actual -> Float.compare(actual, target) >= 0, "Float %s was not greater than or equal to %s", actual, target);

    }

    @Override
    public FloatAssertion isBetween(Float lower, Float upper) {
        throwIfNull(lower, "in a <= x <= b, a can not be null");
        throwIfNull(lower, "in a <= x <= b, b can not be null");
        return test(actual -> Float.compare(actual, lower) >= 0 && Float.compare(actual, upper) <= 0, "Expected %s to be between %s and %s", actual, lower, upper);
    }
}


