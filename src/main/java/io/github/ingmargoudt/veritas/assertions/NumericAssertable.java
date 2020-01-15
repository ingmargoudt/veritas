package io.github.ingmargoudt.veritas.assertions;

public interface NumericAssertable<SELF_TYPE extends NumericAssertable<SELF_TYPE, ELEMENT_TYPE>, ELEMENT_TYPE> {

    SELF_TYPE isSmallerThan(ELEMENT_TYPE target);

    SELF_TYPE isSmallerThanOrEqual(ELEMENT_TYPE target);

    SELF_TYPE isGreaterThan(ELEMENT_TYPE target);

    SELF_TYPE isGreaterThanOrEqual(ELEMENT_TYPE target);

    SELF_TYPE isBetween(ELEMENT_TYPE lower, ELEMENT_TYPE upper);

}