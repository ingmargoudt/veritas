package io.github.ingmargoudt.veritas;

import io.github.ingmargoudt.veritas.assertions.IntAssertion;

public class Veritas {

    public static boolean LOG_PASSED = false;


    public static IntAssertion assertThat(int expected){
       return new IntAssertion(expected);
    }
}
