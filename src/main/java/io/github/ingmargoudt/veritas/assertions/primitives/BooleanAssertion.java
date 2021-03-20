package io.github.ingmargoudt.veritas.assertions.primitives;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;

public class BooleanAssertion extends AbstractAssertion<BooleanAssertion, Boolean> {

    public BooleanAssertion(Boolean actual) {
        super(actual);
    }

    public BooleanAssertion isTrue(){
        return test(actual -> actual,"Expected %s to be true, ", actual);
    }

    public BooleanAssertion isFalse(){
        return test(actual -> !actual,"Expected %s to be false, ", actual);
    }
}
