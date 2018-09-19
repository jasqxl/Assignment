package test;


import main.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FizzBuzzTest {
    @Test
    void testFizz() {
        assertFalse(FizzBuzz.isDivisibleByThree(0));
        assertFalse(FizzBuzz.isDivisibleByThree(-2));
        assertFalse(FizzBuzz.isDivisibleByThree(-3));
        assertFalse(FizzBuzz.isDivisibleByThree(-9));
        assertTrue(FizzBuzz.isDivisibleByThree(3));
        assertTrue(FizzBuzz.isDivisibleByThree(6));
        assertFalse(FizzBuzz.isDivisibleByThree(5));
    }

    @Test
    void testBuzz() {
        assertFalse(FizzBuzz.isDivisibleByFive(0));
        assertFalse(FizzBuzz.isDivisibleByFive(-4));
        assertFalse(FizzBuzz.isDivisibleByFive(-5));
        assertFalse(FizzBuzz.isDivisibleByFive(-15));
        assertTrue(FizzBuzz.isDivisibleByFive(5));
        assertTrue(FizzBuzz.isDivisibleByFive(20));
        assertFalse(FizzBuzz.isDivisibleByFive(6));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("",FizzBuzz.FizzOrBuzz(0));
        assertEquals("", FizzBuzz.FizzOrBuzz(-12));
        assertEquals("",FizzBuzz.FizzOrBuzz(-8));
        assertEquals("1", FizzBuzz.FizzOrBuzz(1));
        assertEquals("4", FizzBuzz.FizzOrBuzz(4));
        assertEquals("Fizz", FizzBuzz.FizzOrBuzz(3));
        assertEquals("Buzz", FizzBuzz.FizzOrBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.FizzOrBuzz(15));
    }
}