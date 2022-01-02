package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideStringsForTestingPersonBMI() {
        return Stream.of(
                Arguments.of(new Person(1.0, 10), "Very severely underweight"),
                Arguments.of(new Person(1.0, 15), "Severely underweight"),
                Arguments.of(new Person(1.0, 18), "Underweight"),
                Arguments.of(new Person(1.0, 20), "Normal (healthy weight)"),
                Arguments.of(new Person(1.0, 25), "Overweight"),
                Arguments.of(new Person(1.0, 30), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.0, 35), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.0, 40), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.0, 45), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.0, 50), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.0, 60), "Obese Class VI (Hyper Obese)")


        );
    }
}


