package io.github.ingmargoudt.veritas;

import io.github.ingmargoudt.veritas.assertions.BooleanAssertion;
import io.github.ingmargoudt.veritas.assertions.IntegerAssertion;

public class Veritas {

    public static boolean LOG_PASSED = false;


    public static IntegerAssertion assertThat(Integer actual){
       return new IntegerAssertion(actual);
    }

    public static BooleanAssertion assertThat(Boolean actual){
        return new BooleanAssertion(actual);
    }
}
