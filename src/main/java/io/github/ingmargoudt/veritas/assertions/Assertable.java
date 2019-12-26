package io.github.ingmargoudt.veritas.assertions;

public interface Assertable<SELF_TYPE extends Assertable<SELF_TYPE, ELEMENT_TYPE>, ELEMENT_TYPE> {

    SELF_TYPE isEqualTo(ELEMENT_TYPE expected);

    SELF_TYPE isNotEqualTo(ELEMENT_TYPE expected);

    SELF_TYPE isNull();

    SELF_TYPE isNotNull();
}