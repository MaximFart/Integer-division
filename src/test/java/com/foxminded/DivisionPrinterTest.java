package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionPrinterTest {
    @Test
    public void process_shouldOutputExceptionMassage_whenInputNull() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new DivisionPrinter(null, 12));
        assertEquals("Input is null", exception.getMessage());
    }

    @Test
    public void testFirstDivision_process_shouldOutputDivision_WhenInputDividendAndDivider() {
        DivisionPrinter divisionPrinter = new DivisionPrinter(5656565, 56);
        divisionPrinter.printGeneralDivision();
        String actual = divisionPrinter.getPrintResult().toString();
        String expected = "_5656565|56\n" +
                " 56     |------\n" +
                " --     |101010\n" +
                "  _56\n" +
                "   56\n" +
                "   --\n" +
                "    _56\n" +
                "     56\n" +
                "     --\n" +
                "       5";
        assertEquals(expected, actual);
    }

    @Test
    public void testSecondDivision_process_shouldOutputDivision_WhenInputDividendAndDivider() {
        DivisionPrinter divisionPrinter = new DivisionPrinter(1024, 8);
        divisionPrinter.printGeneralDivision();
        String actual = divisionPrinter.getPrintResult().toString();
        String expected = "_1024|8\n" +
                "  8  |---\n" +
                " --  |128\n" +
                " _22\n" +
                "  16\n" +
                "  --\n" +
                "  _64\n" +
                "   64\n" +
                "   --\n" +
                "    0";
        assertEquals(expected, actual);
    }

    @Test
    public void testThirdDivision_process_shouldOutputDivision_WhenInputDividendAndDivider() {
        DivisionPrinter divisionPrinter = new DivisionPrinter(1024, 88);
        divisionPrinter.printGeneralDivision();
        String actual = divisionPrinter.getPrintResult().toString();
        String expected = "_1024|88\n" +
                "  88 |--\n" +
                " --- |11\n" +
                " _144\n" +
                "   88\n" +
                "  ---\n" +
                "   56";
        assertEquals(expected, actual);
    }

    @Test
    public void testFourthDivision_process_shouldOutputDivision_WhenInputDividendAndDivider() {
        DivisionPrinter divisionPrinter = new DivisionPrinter(1024, 888);
        divisionPrinter.printGeneralDivision();
        String actual = divisionPrinter.getPrintResult().toString();
        String expected = "_1024|888\n" +
                "  888|---\n" +
                " ----|1\n" +
                "  136";
        assertEquals(expected, actual);
    }

    @Test
    public void process_shouldOutputExceptionMassage_whenInputDividerMoreDividend() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new DivisionPrinter(1024, 8888));
        assertEquals("Incorrect input", exception.getMessage());
    }
}