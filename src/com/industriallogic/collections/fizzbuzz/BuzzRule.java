package com.industriallogic.collections.fizzbuzz;

public class BuzzRule implements Rule {
    public boolean check(int number) {
        return number % 5 == 0;
    }

    public String answer() {
        return FizzBuzz.BUZZ;
    }
}
