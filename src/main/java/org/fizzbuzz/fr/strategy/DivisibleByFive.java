package org.fizzbuzz.fr.strategy;


import org.fizzbuzz.fr.exception.DivisibleByZeroException;

public class DivisibleByFive implements DivisibleStrategy {
        @Override
        public boolean check(Integer number) {
            if (number == null) {
                throw new DivisibleByZeroException("Input cannot be null");
            }
            return number % 5 == 0;
        }
}
