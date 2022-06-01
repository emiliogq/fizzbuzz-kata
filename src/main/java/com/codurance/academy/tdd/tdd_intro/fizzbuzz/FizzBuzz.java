package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

public class FizzBuzz {
    public String getString(int i) {
        String result = ""+i;
        if (i % 3 == 0 && i % 5 == 0){
            result = "FizzBuzz";
        }
        else {
            if (i % 3 == 0){
                result = "Fizz";
            }
            if (i == 5){
                result = "Buzz";
            }

        }

        return result;
    }
}
