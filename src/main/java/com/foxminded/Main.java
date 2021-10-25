package com.foxminded;

public class Main {
    public static void main(String[] args) {
        DivisionPrinter print = new DivisionPrinter(Integer.valueOf(565656565), Integer.valueOf(8));
        print.printGeneralDivision();
        System.out.println(print.getPrintResult());
    }
}
