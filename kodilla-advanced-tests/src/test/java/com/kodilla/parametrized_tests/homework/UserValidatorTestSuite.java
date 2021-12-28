package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.StringManipulator;
import com.kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"aB.-_,","aB-,","wW01234567890","!@#","am","_"})
    public void shouldCheckUserName(String input) {
        assertTrue( validator.validateUsername(input));
    }
    @ParameterizedTest
    @CsvSource(value = {"aB@aaa.com","a-_B@bb.pl","wW01234567890@MAIL.qq","!@#","am!@email.com","_"})
    public void shouldCheckEmail(String input) {
        assertTrue( validator.validateEmail(input));
    }


}
