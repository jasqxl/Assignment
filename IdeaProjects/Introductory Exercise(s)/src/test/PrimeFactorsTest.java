package test;

import main.PrimeFactors;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PrimeFactorsTest {

    @Test
    void testNeg() {
        ArrayList<Integer> testNeg = new ArrayList<Integer>();
        assertArrayEquals(testNeg.toArray(), PrimeFactors.returnPrimeFactors(-237).toArray());
    }

    @Test
    void test0() {
        ArrayList<Integer> test0 = new ArrayList<Integer>();
        assertArrayEquals(test0.toArray(), PrimeFactors.returnPrimeFactors(0).toArray());
    }

    @Test
    void test1() {
        ArrayList<Integer> test1 = new ArrayList<Integer>();
        assertArrayEquals(test1.toArray(), PrimeFactors.returnPrimeFactors(1).toArray());
    }

    @Test
    void test2() {
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.add(2);
        assertArrayEquals(test2.toArray(), PrimeFactors.returnPrimeFactors(2).toArray());
    }

    @Test
    void test3() {
        ArrayList<Integer> test3 = new ArrayList<Integer>();
        test3.add(3);
        assertArrayEquals(test3.toArray(), PrimeFactors.returnPrimeFactors(3).toArray());
    }

    @Test
    void test30() {
        ArrayList<Integer> test30 = new ArrayList<Integer>();
        test30.add(2);
        test30.add(3);
        test30.add(5);
        assertArrayEquals(test30.toArray(), PrimeFactors.returnPrimeFactors(30).toArray());
    }

    @Test
    void test8() {
        ArrayList<Integer> test8 = new ArrayList<Integer>();
        test8.add(2);
        test8.add(2);
        test8.add(2);
        assertArrayEquals(test8.toArray(), PrimeFactors.returnPrimeFactors(8).toArray());
    }
}