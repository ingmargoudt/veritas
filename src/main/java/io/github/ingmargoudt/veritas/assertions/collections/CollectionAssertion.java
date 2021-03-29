package io.github.ingmargoudt.veritas.assertions.collections;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;

import java.util.Collection;

public class CollectionAssertion<T> extends AbstractAssertion<CollectionAssertion<T>, Collection<T>> {
    public CollectionAssertion(Collection<T> actual) {
        super(actual);
    }

    public CollectionAssertion<T> contains(T value) {
        return test(actual -> actual.contains(value), "", value);
    }

    public CollectionAssertion<T> hasSize(int size) {
        return test(actual -> actual.size() == size, "The expected size of this collection is %s", size);
    }

    public CollectionAssertion<T> isEmpty(){
        return test(Collection::isEmpty, "The collection is expected to be empty");
    }


}
