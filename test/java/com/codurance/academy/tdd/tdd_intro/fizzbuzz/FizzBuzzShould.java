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
    void return_fizz_if_number_is_three(){
        assertEquals("Fizz", fizzbuzz.getString(3));
    }

    @Test
    void return_buzz_if_number_is_five(){
        assertEquals("Buzz", fizzbuzz.getString(5));
    }

    @Test
    void return_fizzbuzz_if_number_is_15(){
        assertEquals("FizzBuzz", fizzbuzz.getString(15));
    }

    @Test
    void return_number_if_number_is_1(){
        assertEquals("1", fizzbuzz.getString(1));
    }

    @Test
    void return_number_if_number_is_2(){
        assertEquals("2", fizzbuzz.getString(2));
    }

}
