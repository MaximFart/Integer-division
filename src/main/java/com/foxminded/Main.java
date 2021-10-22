package com.foxminded;

public class Main {
    public static void main(String[] args) {
        Print print = new Print(new Integer(3991), new Integer(35));
        Print print1 = new Print(new Integer(39981), new Integer(35));
        print1.generalDivisionPrint();
        System.out.println(print1.getPrintResult());
    }
}
