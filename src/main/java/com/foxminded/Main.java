package com.foxminded;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            DivisionPrinter print = new DivisionPrinter(null, 56);
            System.out.println(print.printGeneralDivision());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
