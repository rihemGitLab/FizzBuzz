package org.fizzbuzz.fr;

import org.fizzbuzz.fr.exception.DivisibleByZeroException;
import org.fizzbuzz.fr.strategy.FizzBuzzContext;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzContextTest {

    private FizzBuzzContext fizzBuzzContext;

    @Before
    public void setUp() {
        fizzBuzzContext = new FizzBuzzContext();
    }

    @Test
    public void testFizzBuzzForDivisibleByThree() {
        assertEquals("fizz", fizzBuzzContext.getResult(3));
        assertEquals("fizz", fizzBuzzContext.getResult(9));
        assertEquals("fizz", fizzBuzzContext.getResult(27));
    }

    @Test
    public void testFizzBuzzForDivisibleByFive() {
        assertEquals("buzz", fizzBuzzContext.getResult(5));
        assertEquals("buzz", fizzBuzzContext.getResult(20));
        assertEquals("buzz", fizzBuzzContext.getResult(25));
    }

    @Test
    public void testFizzBuzzForDivisibleByThreeAndFive() {
        assertEquals("fizzbuzz", fizzBuzzContext.getResult(15));
        assertEquals("fizzbuzz", fizzBuzzContext.getResult(30));
        assertEquals("fizzbuzz", fizzBuzzContext.getResult(45));
    }
    @Test(expected = IllegalStateException.class)
    public void testFizzBuzzForNonDivisibleNumbers() {
        fizzBuzzContext.getResult(1);
        fizzBuzzContext.getResult(2);
        fizzBuzzContext.getResult(4);
        fizzBuzzContext.getResult(7);
    }


    @Test(expected = DivisibleByZeroException.class)
    public void testFizzBuzzForNullInput() {
        fizzBuzzContext.getResult(null);
    }
}
