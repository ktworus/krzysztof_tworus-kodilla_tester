package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();
    Set<Integer> testNumbers = new HashSet<>();
    int size;
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachine.csv", numLinesToSkip = 1)

    public void toCheckInvalidNumbersException(){

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(testNumbers));

    }
    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, 3, 12, 15})
    public void toCheckNumberOfWins(Set<Integer> testNumbers, int expected) throws InvalidNumbersException {
        assertEquals(expected, gamblingMachine.howManyWins(testNumbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/Gambling computer numbers.csv", numLinesToSkip = 1)
    public void toCheckGeneratedNumbers(Set<Integer> testNumbers, Set<Integer> receivedNumbers){
        assertEquals(testNumbers.size(), gamblingMachine.);

    }



}
