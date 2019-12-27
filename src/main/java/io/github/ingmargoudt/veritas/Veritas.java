package io.github.ingmargoudt.veritas;

import io.github.ingmargoudt.veritas.assertions.BooleanAssertion;
import io.github.ingmargoudt.veritas.assertions.IntegerAssertion;
import io.github.ingmargoudt.veritas.assertions.LongAssertion;
import io.github.ingmargoudt.veritas.assertions.StringAssertion;

public class Veritas {

    public static boolean LOG_PASSED = false;


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
}
