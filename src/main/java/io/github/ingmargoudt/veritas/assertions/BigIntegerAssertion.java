package io.github.ingmargoudt.veritas.assertions;

import java.math.BigInteger;

public class BigIntegerAssertion extends AbstractAssertion<BigIntegerAssertion, BigInteger> implements NumericAssertable<BigIntegerAssertion, BigInteger> {


    public BigIntegerAssertion(BigInteger actual) {
        super(actual);
    }

    @Override
    public BigIntegerAssertion isSmallerThan(BigInteger target) {
        return test(actual -> actual.compareTo(target) < 0, "%s was not smaller than %s", actual, target);
    }

    @Override
    public BigIntegerAssertion isSmallerThanOrEqual(BigInteger target) {
        return test(actual -> actual.compareTo(target) <= 0, "%s was not smaller than or equal to %s", actual, target);
    }

    @Override
    public BigIntegerAssertion isGreaterThan(BigInteger target) {

        return test(actual -> actual.compareTo(target) > 0, "%s was not greater than %s", actual, target);
    }

    @Override
    public BigIntegerAssertion isGreaterThanOrEqual(BigInteger target) {

        return test(actual -> actual.compareTo(target) >= 0, "%s was not greater than or equal to %s", actual, target);
    }

    @Override
    public BigIntegerAssertion isBetween(BigInteger lower, BigInteger upper) {

        return test(actual -> actual.compareTo(lower) >= 0 && actual.compareTo(upper) <= 0, "%s is not between %s and %s", actual, lower, upper);
    }
}