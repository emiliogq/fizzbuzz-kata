package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

public class FizzBuzz {
    public String getString(int i) {
        String result = ""+1;
        if (i == 15){
            result = "FizzBuzz";
        }
        if (i == 5){
            result = "Buzz";
        }
        if (i == 3){
            result = "Fizz";

        }
        if (i == 2) {
            result = ""+2;
        }
        return result;
    }
}
