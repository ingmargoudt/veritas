package io.github.ingmargoudt.veritas.assertions;

public class StringAssertion extends AbstractAssertion<StringAssertion, String>  {
    public StringAssertion(String actual) {
        super(actual);
    }

    public StringAssertion isEmpty(){
        return test(String::isEmpty,"String %s is not empty",actual);
    }

    public StringAssertion startsWith(String start){
        return test(s->s.startsWith(start),"String %s does not start with %s", actual, start);
    }

    public StringAssertion endsWith(String end){
        return test(s->s.endsWith(end),"String %s does not end with %s", actual, end);
    }

    public StringAssertion contains(String substring){
        return test(s->s.contains(substring), "String %s does not contain substring %s", actual, substring);
    }

    public StringAssertion equalsIgnoreCase(String other){
        return test(s->s.equalsIgnoreCase(other),"String %s does not equal %s", actual, other);
    }
}
