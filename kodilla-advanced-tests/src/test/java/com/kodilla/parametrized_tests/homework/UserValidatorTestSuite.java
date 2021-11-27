package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator nameValidator = new UserValidator();
    private UserValidator emailValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"a,false", "a,false", "0, false", "_, false", "-, false", "., false", "a1-,true", "A0_, true", "w._,true", "ab!, false", " sB,false", "0123456789abcdefghijklmnoprstuwxyzABCEDEFGHIJKLMNOPRSTUWXYZ_.-,true"})
    public void shouldValidateUserName(String input, boolean expected) {
        assertEquals(expected, nameValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"a@b.com,true","a,false", "a,false", "0, false", "_, false", "-, false", "., false", "aB-@w.com,true", "A0_@n.pl, true", "w._@go.go,true", "ab!, false", " sB,false", "0123456789abcdefghijklmnoprstuwxyzABCEDEFGHIJKLMNOPRSTUWXYZ_.-@p.pl,true"})
    public void shouldValidateEmail(String input, boolean expected) {
        assertEquals(expected, emailValidator.validateEmail(input));

    }
}