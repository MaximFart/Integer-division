package com.foxminded;

public class Main {
    public static void main(String[] args) {
        DivisionPrinter print = new DivisionPrinter(Integer.valueOf(1024764), Integer.valueOf(8678));
        print.printGeneralDivision();
        System.out.println(print.getPrintResult());
    }
}
