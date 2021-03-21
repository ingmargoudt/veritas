package io.github.ingmargoudt.veritas.assertions.primitives;

import io.github.ingmargoudt.veritas.assertions.AbstractAssertion;

public class ByteAssertion extends AbstractAssertion<ByteAssertion, Byte> {
    public ByteAssertion(Byte actual) {
        super(actual);
    }


    public ByteAssertion hasValue(int value){
        return test(actual -> actual.intValue() == value,"Byte %s has not int value of %s", actual, value);

    }

    public ByteAssertion hasValue(double value) {
       return test(actual -> actual.doubleValue() == value, "Byte %s has not double value of %s", actual, value);
    }

    public ByteAssertion hasValue(float value){
        return test(actual -> actual.floatValue() == value, "Byte %s has not float value of %s",actual, value);
    }

    public ByteAssertion hasValue(long value){
        return test(actual -> actual.longValue() == value, "Byte %s has not long value of %s", actual, value);
    }

    public ByteAssertion hasValue(short value){
        return test(actual -> actual.shortValue() == value, "Byte %s has not short value of %s", actual, value);
    }
}
