package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @Test
    void return_fizz_if_number_is_three(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.getString(3));
    }
}
