package io.github.ingmargoudt.veritas.assertions.primitives;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;
import io.github.ingmargoudt.veritas.assertions.NaturalNumberAssertable;

public class ShortAssertion extends AbstractAssertion<ShortAssertion, Short> implements NaturalNumberAssertable<ShortAssertion, Short> {

    public ShortAssertion(Short actual) {
        super(actual);
    }

    public ShortAssertion isEven() {
        return test(n -> n % 2 == 0, "Expected %s to be even, ", actual);
    }

    public ShortAssertion isOdd() {
        return test(actual -> actual % 2 != 0, "Expected %s to be odd ", actual);
    }

    public ShortAssertion isSmallerThan(Short target) {
        throwIfNull(target, "in a < b , b can not be null");
        return test(actual -> actual < target, "Expected %s to be smaller than %s ", actual, target);
    }


    public ShortAssertion isSmallerThanOrEqual(Short target) {
        throwIfNull(target, "in a <= b , b can not be null");
        return test(actual -> actual <= target, "Expected %s to be smaller than or equal to %s ", actual, target);
    }

    public ShortAssertion isGreaterThan(Short target) {
        throwIfNull(target, "in a > b , b can not be null");
        return test(actual -> actual > target, "Expected %s to be greater than %s ", actual, target);
    }

    public ShortAssertion isGreaterThanOrEqual(Short target) {
        throwIfNull(target, "in a >= b , b can not be null");
        return test(actual -> actual >= target, "Expected %s to be greater than or equal to %s ", actual, target);
    }

    public ShortAssertion isBetween(Short lower, Short upper) {
        throwIfNull(lower, "Lower bound can not be null");
        throwIfNull(upper, "Upper bound can not be null");

        return test(actual -> actual >= lower && actual <= upper, "Expected %s to be between %s and %s", actual, lower, upper);
    }

    public ShortAssertion isMultipleOf(Short multiplicant) {
        throwIfNull(multiplicant, "multiplicant can not be null");

        return test(actual -> actual % multiplicant == 0, "Expected %s to be a multiple of %s ", actual, multiplicant);
    }

    @Override
    public ShortAssertion isPositive() {
       return test(actual -> actual > 0, "Expected %s to be > positive",actual);
    }
}
