package main;

public class FizzBuzz {
    private static String fizz = "Fizz", buzz = "Buzz", fizzBuzz = "FizzBuzz";

    public static boolean isDivisibleByThree (int numberToCheck) {
        return (numberToCheck > 0 && numberToCheck%3 == 0) ? true : false;
    }

    public static boolean isDivisibleByFive (int numberToCheck) {
        return (numberToCheck > 0 && numberToCheck%5 == 0) ? true : false;
    }

    public static String FizzOrBuzz (int numberToCheck) {
        if (isDivisibleByThree(numberToCheck) && isDivisibleByFive(numberToCheck)) {
            return fizzBuzz;
        }
        else if (isDivisibleByThree(numberToCheck)) {
            return fizz;
        }
        else if (isDivisibleByFive(numberToCheck)) {
            return buzz;
        }
        else if (numberToCheck <= 0 || numberToCheck > 100) return "";
        else return Integer.toString(numberToCheck);
    }

    public static void fizzBuzz() {

        for (int i = 0; i <= 100; i++) {
            System.out.println(FizzOrBuzz(i));
        }
    }

}

