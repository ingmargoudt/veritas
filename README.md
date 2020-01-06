[![javadoc](https://javadoc.io/badge2/io.github.ingmargoudt/veritas/javadoc.svg)](https://javadoc.io/doc/io.github.ingmargoudt/veritas)
[![Build Status](https://travis-ci.org/ingmargoudt/veritas.svg?branch=master)](https://travis-ci.org/ingmargoudt/veritas) 
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) 
[![badge-jdk](https://img.shields.io/badge/jdk-8-green.svg)](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.ingmargoudt/veritas/badge.png)](https://maven-badges.herokuapp.com/maven-central/io.github.ingmargoudt/veritas/badge.png)

# Veritas
Veritas is a fluent assertions library, inspired by the self-typing mechanism of AssertJ/Fest. 
It tells you when a test fails:
    String text = "abc";
    assertThat(text).endsWith("d");
    
It can tell you a custom message on test fail:
    String text = "def";
    assertThat(text).onFail("text does not start with 'a'").startsWith("a");

It can tell you a custom message on a test pass:
    int number = 42;
    assertThat(number).onSuccess(number+" is indeed even.").isEven();
    
Veritas aims to be small and concise and will always tell you the truth.
