package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "PersonSource.provideStringsForTestingPersonBMI())"
    public void shouldProvideBMIDescription(PersonSource personSource, String expected) {
        Person person = new Person(44,55);
        assertEquals(expected, person.getBMI());
}
}
