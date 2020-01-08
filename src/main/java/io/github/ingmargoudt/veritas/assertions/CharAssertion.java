package io.github.ingmargoudt.veritas.assertions;

public class CharAssertion extends AbstractAssertion<CharAssertion, Character> {
    public CharAssertion(Character actual) {
        super(actual);
    }

    public CharAssertion isLowerCase(){
        return test(Character::isLowerCase, "This character is not lowercase");
    }

    public CharAssertion isUpperCase(){
        return test(Character::isUpperCase, "This character is not uppercase");
    }
}
