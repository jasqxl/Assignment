package main;

import java.util.*;

public class PrimeFactors {
    private static int number = 0;

    public static ArrayList<Integer> returnPrimeFactors (int n) {

        ArrayList<Integer> primeFactorArray = new ArrayList<Integer>();
        number = n;
        if (number < 2) return primeFactorArray;
        else {
            int primeFactor = 2;
            do {
                primeFactorArray.add(getFactors(primeFactor));
            } while (number > 1);
        }
        return primeFactorArray;
    }

    public static int getFactors(int primeFactor) {

        if (primeFactor == 2 && number%primeFactor == 0) {
            number = number/primeFactor;
            return primeFactor;
        }
        else if (number%primeFactor == 0) {
            number = number/primeFactor;
            return primeFactor;
        }
        else {
            primeFactor = primeFactor + 1;
        }

        return getFactors(primeFactor);
    }

}
