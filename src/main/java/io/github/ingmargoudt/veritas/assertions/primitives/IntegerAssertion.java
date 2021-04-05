package io.github.ingmargoudt.veritas.assertions.primitives;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;
import io.github.ingmargoudt.veritas.assertions.NaturalNumberAssertable;

public class IntegerAssertion extends AbstractAssertion<IntegerAssertion, Integer> implements NaturalNumberAssertable<IntegerAssertion, Integer> {

    public IntegerAssertion(Integer actual) {
        super(actual);
    }

    public IntegerAssertion isEven() {
        return test(n -> n % 2 == 0, "Expected %s to be even, ", actual);
    }

    public IntegerAssertion isOdd() {
        return test(actual -> actual % 2 != 0, "Expected %s to be odd ", actual);
    }

    public IntegerAssertion isSmallerThan(Integer target) {
        throwIfNull(target, "in a < b , b can not be null");
        return test(actual -> actual < target, "Expected %s to be smaller than %s ", actual, target);
    }


    public IntegerAssertion isSmallerThanOrEqual(Integer target) {
        throwIfNull(target, "in a <= b , b can not be null");
        return test(actual -> actual <= target, "Expected %s to be smaller than or equal to %s ", actual, target);
    }

    public IntegerAssertion isGreaterThan(Integer target) {
        throwIfNull(target, "in a > b , b can not be null");
        return test(actual -> actual > target, "Expected %s to be greater than %s ", actual, target);
    }

    public IntegerAssertion isGreaterThanOrEqual(Integer target) {
        throwIfNull(target, "in a >= b , b can not be null");
        return test(actual -> actual >= target, "Expected %s to be greater than or equal to %s ", actual, target);
    }

    public IntegerAssertion isBetween(Integer lower, Integer upper) {
        throwIfNull(lower, "Lower bound can not be null");
        throwIfNull(upper, "Upper bound can not be null");

        return test(actual -> actual >= lower && actual <= upper, "Expected %s to be between %s and %s", actual, lower, upper);
    }

    public IntegerAssertion isMultipleOf(Integer multiplicant) {
        throwIfNull(multiplicant, "multiplicant can not be null");

        return test(actual -> actual % multiplicant == 0, "Expected %s to be a multiple of %s ", actual, multiplicant);
    }

    @Override
    public IntegerAssertion isPositive() {
       return test(actual -> actual > 0, "Expected %s to be > positive",actual);
    }
}
