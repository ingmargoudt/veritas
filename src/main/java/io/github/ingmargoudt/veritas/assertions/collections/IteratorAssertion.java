package io.github.ingmargoudt.veritas.assertions.collections;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;

import java.util.Iterator;

public class IteratorAssertion<T> extends AbstractAssertion<IteratorAssertion<T>, Iterator<T>> {
    public IteratorAssertion(Iterator<T> actual) {
        super(actual);
    }

    public IteratorAssertion<T> isEmpty(){
        return test(actual -> !actual.hasNext(), "The iterator is expected to be empty");
    }

    public IteratorAssertion<T> hasNext(){
        return test(Iterator::hasNext, "The iterator is expected to have an element");
    }


}
