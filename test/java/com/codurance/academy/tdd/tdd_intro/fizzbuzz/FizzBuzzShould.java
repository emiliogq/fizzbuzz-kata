package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    private FizzBuzz fizzbuzz;

    @BeforeEach
    void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    void return_number_if_number_is_not_multiple_of_three_or_five() {
        int[] non_multiple = {1, 2, 4, 7, 8, 11, 13, 14};

        for (int i = 0; i < non_multiple.length; i++) {
            assertEquals(String.valueOf(non_multiple[i]), fizzbuzz.getString(non_multiple[i]));
        }

    }

    @Test
    void return_fizz_if_number_is_multiple_of_three(){
        checkMultiplesOf(3, "Fizz", 15);
    }

    @Test
    void return_buzz_if_number_is_multiple_of_five(){
        checkMultiplesOf(5, "Buzz", 15);
    }

    private void checkMultiplesOf(int number, String expectedResult, int limit) {
        for (int i = number; i < limit; i+= number) {
            assertEquals(expectedResult, fizzbuzz.getString(i));
        }
    }
    @Test
    void return_fizzbuzz_if_number_is_multiple_of_three_and_five(){
        checkMultiplesOf(3*5,"FizzBuzz", 90);
    }

}
