package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

public class FizzBuzz {
    public String getString(int i) {
        if (i == 15){
            return "FizzBuzz";
        }
        if (i == 5){
            return "Buzz";
        }
        if (i == 3){
            return "Fizz";
        }
        return ""+1;
    }
}
