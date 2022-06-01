package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

public class FizzBuzz {
    public String getString(int i) {
        String result = ""+i;
        if (isDivisibleBy3(i) && isDivisibleBy5(i)){
            result = "FizzBuzz";
        }
        else {
            if (isDivisibleBy3(i)){
                result = "Fizz";
            }
            if (isDivisibleBy5(i)){
                result = "Buzz";
            }

        }

        return result;
    }

    private boolean isDivisibleBy5(int i) {
        return i % 5 == 0;
    }

    private boolean isDivisibleBy3(int i) {
        return i % 3 == 0;
    }
}
