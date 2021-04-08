package io.github.ingmargoudt.veritas.assertions;

public interface NaturalNumberAssertable<SELF_TYPE extends NaturalNumberAssertable<SELF_TYPE, ELEMENT_TYPE>, ELEMENT_TYPE> extends NumericAssertable<SELF_TYPE, ELEMENT_TYPE>{

    SELF_TYPE isEven();

}
