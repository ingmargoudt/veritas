package io.github.ingmargoudt.veritas;

import io.github.ingmargoudt.veritas.assertions.IntegerAssertion;

public class Veritas {

    public static boolean LOG_PASSED = false;


    public static IntegerAssertion assertThat(Integer actual){
       return new IntegerAssertion(actual);
    }
}
