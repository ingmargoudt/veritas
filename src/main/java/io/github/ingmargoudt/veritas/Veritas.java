package io.github.ingmargoudt.veritas;

import io.github.ingmargoudt.veritas.assertions.*;

import java.util.Collection;
import java.util.Map;

public class Veritas {

    private Veritas(){}

    public static IntegerAssertion assertThat(Integer actual){
       return new IntegerAssertion(actual);
    }

    public static BooleanAssertion assertThat(Boolean actual){
        return new BooleanAssertion(actual);
    }

    public static LongAssertion assertThat(Long actual){
        return new LongAssertion(actual);
    }


    public static StringAssertion assertThat(String actual){
        return new StringAssertion(actual);
    }

    public static EnumAssertion assertThat(Enum actual){ return new EnumAssertion(actual);}

    public static <T> CollectionAssertion<T> assertThat(Collection<T> actual){
        return new CollectionAssertion<>(actual);
    }

    public static CharAssertion assertThat(Character actual){
        return new CharAssertion(actual);
    }

    public static <K,V> MapAssertion<K,V> assertThat(Map<K,V> actual){
        return new MapAssertion<>(actual);
    }

    public static DoubleAssertion assertThat(Double actual) { return new DoubleAssertion(actual);}

}
