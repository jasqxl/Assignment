package main;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nPrint one asterisk '*':");
        System.out.println("\n" + PrintAsterisk.printSingleLine(1));

        System.out.println("\nPrint eight asterisks '********':");
        System.out.println("\n" + PrintAsterisk.printSingleLine(8));

        System.out.println("\nPrint a vertical line of 3 asterisks:");
        System.out.println("\n" + PrintAsterisk.printMultipleLines(3, false));

        System.out.println("\nPrint a right triangle of asterisks (3 levels):");
        System.out.println("\n" + PrintAsterisk.printMultipleLines(3, true));

        System.out.println("\nPrint a diamond asterisk (5 levels):");
        System.out.println("\n" + PrintAsterisk.printDiamondAsterisk(5));

    }
}
