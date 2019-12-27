package io.github.ingmargoudt.veritas.assertions;

public class StringAssertion extends AbstractAssertion<StringAssertion, String>  {
    public StringAssertion(String actual) {
        super(actual);
    }

    public StringAssertion isEmpty(){
        return test(String::isEmpty,"String %s is not empty",actual);
    }

    public StringAssertion startsWith(String start){
        return test(s->s.startsWith(start),"String %s does not start with", actual, start);
    }
}
