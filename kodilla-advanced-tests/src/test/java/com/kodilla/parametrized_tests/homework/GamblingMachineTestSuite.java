package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers.csv", numLinesToSkip = 0, delimiter = ':')
    public void checkValidNumbers(String userNumbers) throws InvalidNumbersException {
        Set<Integer> validNumbers = getUserNumbers(userNumbers);
        int result = gamblingMachine.howManyWins(validNumbers);
        System.out.println(result);
        assertTrue( 0 <= result && result <= 6 );
}
    @ParameterizedTest
    @CsvFileSource(resources = "/invalid.csv", numLinesToSkip = 0, delimiter = ':')
    public void checkInvalidNumbers(String userNumbers) throws InvalidNumbersException {
        Set<Integer> invalidNumbers = getUserNumbers(userNumbers);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidNumbers));

    }
    public Set<Integer> getUserNumbers(String numbersStr) {
        String[] numbersStringArray = numbersStr.split(";");
        int[] numbers = new int[numbersStringArray.length];
        for (int i = 0; i < numbersStringArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersStringArray[i]);

        }
        Set<Integer> userNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        return userNumbers;
    }


}











