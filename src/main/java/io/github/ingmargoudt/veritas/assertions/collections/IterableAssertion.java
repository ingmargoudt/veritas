package io.github.ingmargoudt.veritas.assertions.collections;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;

public class IterableAssertion<T> extends AbstractAssertion<IterableAssertion<T>, Iterable<T>> {
    public IterableAssertion(Iterable<T> actual) {
        super(actual);
    }

    public IterableAssertion<T> isEmpty(){
        return test(actual -> !actual.iterator().hasNext(), "The iterable is expected to be empty");
    }

    public IterableAssertion<T> isNotEmpty(){
        return test(actual -> actual.iterator().hasNext(), "The iterable is expected to not be empty");
    }


}
