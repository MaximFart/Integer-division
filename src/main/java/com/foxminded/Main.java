package com.foxminded;

public class Main {
    public static void main(String[] args) {
        IntegerDivision integerDivision = new IntegerDivision(new Integer(1024), new Integer(8));
        integerDivision.resultingDivisionProcess();
        System.out.println(integerDivision.printResult);
    }
}
