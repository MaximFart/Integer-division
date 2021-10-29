package com.foxminded;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            DivisionPrinter print = new DivisionPrinter(5656565, 56);
            print.printGeneralDivision();
            System.out.println(print.getPrintResult());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
