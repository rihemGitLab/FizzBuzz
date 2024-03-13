package org.fizzbuzz.fr;

import org.fizzbuzz.fr.exception.DivisibleByZeroException;
import org.fizzbuzz.fr.strategy.DivisibleByThree;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisibleByThreeTest {

    @Test
    public void testDivisibleByThree() {
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        assertTrue(divisibleByThree.check(9));
        assertTrue(divisibleByThree.check(12));
        assertFalse(divisibleByThree.check(5));
    }

    @Test(expected = DivisibleByZeroException.class)
    public void testNullInput() {
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        divisibleByThree.check(null);
    }
}
