package com.industriallogic.collections.fizzbuzz;

public class FizzRule implements Rule {
    public boolean check(int number) {
        return number % 3 == 0;
    }
    public String answer() {
        return FizzBuzz.FIZZ;
    }

}
