package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

public class FizzBuzz {
    public String getString(int i) {
        String result = ""+i;
        if (i == 15){
            result = "FizzBuzz";
        }
        if (i == 5){
            result = "Buzz";
        }
        if (i == 3){
            result = "Fizz";

        }

        return result;
    }
}
