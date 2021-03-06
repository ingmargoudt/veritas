package io.github.ingmargoudt.veritas.assertions;

import java.util.Optional;

public class OptionalAssertion<T>  extends AbstractAssertion<OptionalAssertion<T>, Optional<T>>  {

    public OptionalAssertion(Optional<T> actual) {
        super(actual);
    }

    public OptionalAssertion<T> isPresent(){
        return test(Optional::isPresent,"optional has no value");
    }

    public OptionalAssertion<T> isEmpty(){
        return test(actual -> !actual.isPresent(),"optional has a value ");
    }
}
