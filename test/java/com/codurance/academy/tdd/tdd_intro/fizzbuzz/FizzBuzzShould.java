package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    private FizzBuzz fizzbuzz;

    @BeforeEach
    void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    void return_fizz_if_number_is_three(){
        assertEquals("Fizz", fizzbuzz.getString(3));
    }

    @Test
    void return_buzz_if_number_is_five(){
        assertEquals("Buzz", fizzbuzz.getString(5));
    }

    @Test
    void return_fizzbuzz_if_number_is_fifteen(){
        assertEquals("FizzBuzz", fizzbuzz.getString(15));
    }

    @Test
    void return_number_if_number_is_not_multiple_of_three_or_five() {
        int[] non_multiple = {0, 1, 2, 4, 6, 7, 8, 9, 11, 13, 14};

        for (int i = 0; i < non_multiple.length; i++) {
            assertEquals(String.valueOf(non_multiple[i]), fizzbuzz.getString(non_multiple[i]));
        }

    }

}
