package com.industriallogic.collections.fizzbuzz;

public class FizzBuzzRule implements Rule {
    public boolean check(int number) {
        return new FizzRule().check(number) && new BuzzRule().check(number);
    }
    public String answer() {
        return FizzBuzz.FIZZ_BUZZ;
    }
}
