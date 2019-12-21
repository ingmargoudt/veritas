package io.github.ingmargoudt.tester;

import io.github.ingmargoudt.tester.assertions.IntAssertion;

public class Tester {

    public static boolean LOG_PASSED = false;


    public static IntAssertion assertThat(int expected){
       return IntAssertion.of(expected);
    }
}
