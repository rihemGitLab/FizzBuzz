package org.fizzbuzz.fr;

import org.fizzbuzz.fr.exception.DivisibleByZeroException;
import org.fizzbuzz.fr.strategy.DivisibleByThreeAndFive;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisibleByThreeAndFiveTest {

    @Test
    public void testDivisibleByThreeAndFive() {
        DivisibleByThreeAndFive divisibleByThreeAndFive = new DivisibleByThreeAndFive();
        assertTrue(divisibleByThreeAndFive.check(15));
        assertTrue(divisibleByThreeAndFive.check(30));
        assertFalse(divisibleByThreeAndFive.check(7));
    }

    @Test(expected = DivisibleByZeroException.class)
    public void testNullInput() {
        DivisibleByThreeAndFive divisibleByThreeAndFive = new DivisibleByThreeAndFive();
        divisibleByThreeAndFive.check(null);
    }
}
