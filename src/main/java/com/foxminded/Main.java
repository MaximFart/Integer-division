package com.foxminded;

public class Main {
    public static void main(String[] args) {
        Print print = new Print(new Integer(12), new Integer(54));
        print.generalDivisionPrint();
        System.out.println(print.getPrintResult());
    }
}
