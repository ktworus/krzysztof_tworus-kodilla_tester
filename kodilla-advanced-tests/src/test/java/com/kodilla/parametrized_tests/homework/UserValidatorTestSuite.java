package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.StringManipulator;
import com.kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aB.-_", "aB-", "wW01234567890"})
    public void shouldCheckUserName(String input) {
        assertTrue(validator.validateUsername(input));
    }
    @ParameterizedTest
    @ValueSource(strings = {"!@#", "am", "_"})
    public void shouldCheckUserIncorrectName(String input) {
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aB@aaa.com", "a-_B@bb.pl", "wW01234567890@MAIL.qq"})
    public void shouldCheckEmail(String input) {
        assertTrue(validator.validateEmail(input));
    }
    @ParameterizedTest
    @ValueSource(strings = {"!@#", "am!@email.com", "_"})
    public void shouldCheckIncorrectEmail(String input) {
        assertFalse(validator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"aB.-_, true","!@#, false"})
    public void shouldCheckUserNames(String input, boolean checker) {
        assertEquals(validator.validateUsername(input),checker);
    }
}


