package com.industriallogic.collections.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String answer(int number) {

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new FizzBuzzRule());
        rules.add(new FizzRule());
        rules.add(new BuzzRule());

        for(Rule rule: rules) {
            if(rule.check(number)){
                return rule.answer();
            }
        }

        return Integer.toString(number);
    }
}
