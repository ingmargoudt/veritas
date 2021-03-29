package io.github.ingmargoudt.veritas;

import io.github.ingmargoudt.veritas.assertions.*;
import io.github.ingmargoudt.veritas.assertions.collections.CollectionAssertion;
import io.github.ingmargoudt.veritas.assertions.collections.IterableAssertion;
import io.github.ingmargoudt.veritas.assertions.collections.IteratorAssertion;
import io.github.ingmargoudt.veritas.assertions.collections.MapAssertion;
import io.github.ingmargoudt.veritas.assertions.primitives.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

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


    public static FloatAssertion assertThat(Float actual) { return new FloatAssertion(actual);}

    public static BigIntegerAssertion assertThat(BigInteger actual){
        return new BigIntegerAssertion(actual);
    }

    public static BigDecimalAssertion assertThat(BigDecimal actual){
        return new BigDecimalAssertion(actual);
    }

    public static <T> OptionalAssertion<T> assertThat(Optional<T> actual){
        return new OptionalAssertion<>(actual);
    }

    public static ByteAssertion assertThat(Byte actual){
        return new ByteAssertion(actual);
    }

    public static <T> IterableAssertion<T> assertThat(Iterable<T> actual){
        return new IterableAssertion<>(actual);
    }
    public static <T> IteratorAssertion<T> assertThat(Iterator<T> actual){
        return new IteratorAssertion<>(actual);
    }
}
