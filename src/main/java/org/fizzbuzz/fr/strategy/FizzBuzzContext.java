package org.fizzbuzz.fr.strategy;

import org.fizzbuzz.fr.exception.DivisibleByZeroException;
import org.fizzbuzz.fr.strategy.DivisibleByFive;
import org.fizzbuzz.fr.strategy.DivisibleByThree;
import org.fizzbuzz.fr.strategy.DivisibleByThreeAndFive;
import org.fizzbuzz.fr.strategy.DivisibleStrategy;

import java.util.Arrays;

public class FizzBuzzContext {
    private DivisibleStrategy[] strategies;

    public FizzBuzzContext() {
        this.strategies = new DivisibleStrategy[] {
                new DivisibleByThreeAndFive(),
                new DivisibleByThree(),
                new DivisibleByFive()
        };
    }

    public String getResult(Integer number) {
        if (number == null) {
            throw new DivisibleByZeroException("Input cannot be null");
        }

        for (DivisibleStrategy strategy : strategies) {
            if (strategy.check(number)) {
                if (strategy instanceof DivisibleByThreeAndFive) {
                    return "fizzbuzz";
                } else if (strategy instanceof DivisibleByThree) {
                    return "fizz";
                } else if (strategy instanceof DivisibleByFive) {
                    return "buzz";
                }
            }
        }

        throw new IllegalStateException("No strategy matched");
    }

}
