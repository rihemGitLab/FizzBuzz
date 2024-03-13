package org.fizzbuzz.fr;

import org.fizzbuzz.fr.exception.DivisibleByZeroException;
import org.fizzbuzz.fr.strategy.DivisibleByFive;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisibleByFiveTest {

    @Test
    public void testDivisibleByFive() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        assertTrue(divisibleByFive.check(10));
        assertTrue(divisibleByFive.check(20));
        assertFalse(divisibleByFive.check(9));
    }

    @Test(expected = DivisibleByZeroException.class)
    public void testNullInput() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        divisibleByFive.check(null);
    }
}
