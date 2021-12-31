package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideStringsForTestingPersonBMI() {
        return Stream.of(
                Arguments.of("185, 4", "blabla")

        );
    }
}


