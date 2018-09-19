package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        System.out.println("\nPrint one asterisk '*':");
////        System.out.println("\n" + PrintAsterisk.printSingleLine(1));
////
////        System.out.println("\nPrint eight asterisks '********':");
////        System.out.println("\n" + PrintAsterisk.printSingleLine(8));
////
////        System.out.println("\nPrint a vertical line of 3 asterisks:");
////        System.out.println("\n" + PrintAsterisk.printMultipleLines(3, false));
////
////        System.out.println("\nPrint a right triangle of asterisks (3 levels):");
////        System.out.println("\n" + PrintAsterisk.printMultipleLines(3, true));
////
////        System.out.println("\nPrint a diamond asterisk (5 levels):");
////        System.out.println("\n" + PrintAsterisk.printDiamondAsterisk(5,""));
////
////        System.out.println("\nPrint a diamond asterisk with name (4 levels):");
////        System.out.println("\n" + PrintAsterisk.printDiamondAsterisk(4,"Jasmine"));
////
////        System.out.println("\nFizz or Buzz:");
////        FizzBuzz.fizzBuzz();

        System.out.println("\nGet prime factor on Number _:");
        ArrayList<Integer> printPrimeFactors = PrimeFactors.returnPrimeFactors(30);
        for (int i = 0; i < printPrimeFactors.size(); i ++) {

            if (i == printPrimeFactors.size() - 1) System.out.print(printPrimeFactors.get(i));
            else System.out.print(printPrimeFactors.get(i) + ", ");
        }
    }
}
