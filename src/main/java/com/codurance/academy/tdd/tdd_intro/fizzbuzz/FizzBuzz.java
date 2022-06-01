package com.codurance.academy.tdd.tdd_intro.fizzbuzz;

public class FizzBuzz {
    public String getString(int i) {
        String result = ""+i;
        if (isDivisibleBy(i, 3) && isDivisibleBy(i, 5)){
            result = "FizzBuzz";
        }
        else {
            if (isDivisibleBy(i, 3)){
                result = "Fizz";
            }
            if (isDivisibleBy(i, 5)){
                result = "Buzz";
            }

        }
        return result;
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}
