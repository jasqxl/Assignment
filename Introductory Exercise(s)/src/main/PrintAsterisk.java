package main;

public class PrintAsterisk {

    public static String printSingleLine(int numberOfAsteriskToPrint) {
        String printToConsole = "";
        for (int i = 1; i <= numberOfAsteriskToPrint; i++) {
            printToConsole = printToConsole + "*";
        }

        return printToConsole;
    }

    public static String printMultipleLines(int numberOfLinesToPrint, boolean isTriangle) {
        String printToConsole = "";

        for (int i = 1; i <= numberOfLinesToPrint; i++) {
            printToConsole = printToConsole + printSingleLine(verticalLineOrRightTriangle(isTriangle, i)) + "\n\n";
        }

        return printToConsole;
    }

    private static int verticalLineOrRightTriangle (boolean isTriangle, int asteriskCount) {
        if (isTriangle) return asteriskCount;
        return 1;
    }

    public static String printDiamondAsterisk(int numberOfLinesToPrint, String name) {
        String printToConsole = "", newLine = "";
        int maxAsterisk = (2*numberOfLinesToPrint)-1, asteriskPerLine = 0;

        for (int i = 1; i <= numberOfLinesToPrint + numberOfLinesToPrint - 1; i++) {

            if (i < numberOfLinesToPrint) {
                asteriskPerLine = (2 * i) - 1;
                newLine = "";
            }
            else if (i == numberOfLinesToPrint && name.length() == 0) {
                asteriskPerLine = (2*i)-1;
                newLine = "";
            }
            else  if (i == numberOfLinesToPrint && name.length() != 0) {
                asteriskPerLine = 0;
                newLine = name;
            }
            else {
                asteriskPerLine = asteriskPerLine - 2;
                newLine = "";
            }

            if (asteriskPerLine == 0) {
                printToConsole = printToConsole + newLine + printBlanks(0) + printSingleLine(asteriskPerLine) + "\n\n";
                asteriskPerLine = maxAsterisk;
            }
            else {
                printToConsole = printToConsole + newLine + printBlanks((maxAsterisk-asteriskPerLine)/2) + printSingleLine(asteriskPerLine) + "\n\n";
            }
        }

        return printToConsole;
    }

    private static String printBlanks (int numberOfBlanks) {
        String stringOfBlanks = "";
        for (int i = 1; i <= numberOfBlanks; i++) {
            stringOfBlanks = stringOfBlanks + " ";
        }

        return stringOfBlanks;
    }
}