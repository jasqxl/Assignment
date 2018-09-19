package test;

import main.PrintAsterisk;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintAsteriskTest {

    @Test
    void testAsteriskSingleLine() {
        assertEquals("", PrintAsterisk.printSingleLine(0));
        assertEquals("*", PrintAsterisk.printSingleLine(1));
        assertEquals("**********", PrintAsterisk.printSingleLine(10));
    }

    @Test
    void testAsteriskMultipleLines() {
        assertEquals("", PrintAsterisk.printMultipleLines(0, true));
        assertEquals("", PrintAsterisk.printMultipleLines(0, false));
        assertEquals("*\n\n", PrintAsterisk.printMultipleLines(1, true));
        assertEquals("*\n\n", PrintAsterisk.printMultipleLines(1, false));
        assertEquals("*\n\n**\n\n***\n\n****\n\n*****\n\n******\n\n*******\n\n********\n\n*********\n\n**********\n\n", PrintAsterisk.printMultipleLines(10, true));
        assertEquals("*\n\n*\n\n*\n\n*\n\n*\n\n*\n\n*\n\n*\n\n*\n\n*\n\n", PrintAsterisk.printMultipleLines(10, false));
    }

    @Test
    void testDiamondAsterisk() {
        assertEquals("", PrintAsterisk.printDiamondAsterisk(0,""));
        assertEquals("*\n\n", PrintAsterisk.printDiamondAsterisk(1,""));
        assertEquals(" *\n\n***\n\n *\n\n", PrintAsterisk.printDiamondAsterisk(2,""));
        assertEquals("  *\n\n ***\n\n*****\n\n ***\n\n  *\n\n", PrintAsterisk.printDiamondAsterisk(3,""));
        assertEquals("    *\n\n   ***\n\n  *****\n\n *******\n\n*********\n\n *******\n\n  *****\n\n   ***\n\n    *\n\n", PrintAsterisk.printDiamondAsterisk(5,""));
    }

    @Test
    void testDiamondWithNameAsterisk() {
        assertEquals("", PrintAsterisk.printDiamondAsterisk(0, "Jasmine"));
        assertEquals("Jasmine\n\n", PrintAsterisk.printDiamondAsterisk(1, "Jasmine"));
        assertEquals(" *\n\nJasmine\n\n *\n\n", PrintAsterisk.printDiamondAsterisk(2, "Jasmine"));
        assertEquals("  *\n\n ***\n\nJasmine\n\n ***\n\n  *\n\n", PrintAsterisk.printDiamondAsterisk(3, "Jasmine"));
        assertEquals("    *\n\n   ***\n\n  *****\n\n *******\n\nJasmine\n\n *******\n\n  *****\n\n   ***\n\n    *\n\n", PrintAsterisk.printDiamondAsterisk(5,"Jasmine"));
    }

//    @org.junit.jupiter.api.Test
//    public void printAsterisk() {
//
//    }
}