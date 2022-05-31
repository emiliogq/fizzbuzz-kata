package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @Test
    void return_fizz_if_number_is_three(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.getString(3));
    }

    @Test
    void return_buzz_if_number_is_five(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Buzz", fizzbuzz.getString(5));
    }

    @Test
    void return_fizzbuzz_if_number_is_15(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzbuzz.getString(15));
    }

}
