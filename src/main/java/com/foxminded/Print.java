package com.foxminded;

public class Print extends MethodsDivision {

    public Print(Integer dividend, Integer divider) throws IllegalArgumentException {
        super(dividend, divider);
    }
    public void generalDivisionPrint() {
        headDivisionPrint();
        while (getDividend() >= getDivider()) {
            getPrintResult().append("\n" + getSpace().toString() + "_" + this.createNotFullDivisible());
            selectNextNotFullDivisible();
            getPrintResult().append("\n" + getSpace().toString() + " " + getMultiplier() * getDivider());
            getPrintResult().append("\n" + getSpace().toString() + " ");
            printChar("-", getNotFullDivisible().length());
            getSpace().append(" ");
        }
        remainsDivisionPrint();
    }

    public void headDivisionPrint() {
        getPrintResult().append("_" + Integer.toString(getDividend()) + "|" + Integer.toString(getDivider()));
        int result = getDividend() / getDivider();
        getPrintResult().append("\n" + getSpace().toString() + "_" + this.createNotFullDivisible());
        printChar(" ", Integer.toString(getDividend()).length() - getNotFullDivisible().length());
        getPrintResult().append("|");
        printChar("-", Integer.toString(getDividend()).length());
        selectNextNotFullDivisible();
        if (getNotFullDivisible().length() > Integer.toString(getMultiplier() * getDivider()).length()) {
            getPrintResult().append("\n" + getSpace().toString() + "  " + getMultiplier() * getDivider());
        } else if (getNotFullDivisible().length() == Integer.toString(getMultiplier() * getDivider()).length()) {
            getPrintResult().append("\n" + getSpace().toString() + " " + getMultiplier() * getDivider());
        }
        printChar(" ", Integer.toString(getDividendImmutable()).length() - getNotFullDivisible().length());
        getPrintResult().append("|" + result);
        getPrintResult().append("\n" + getSpace().toString() + " ");
        printChar("-", getNotFullDivisible().length());
        getSpace().append(" ");
    }

    public void remainsDivisionPrint() {
        if (Integer.toString(getDividendImmutable()).length() == 1) {
            getPrintResult().append("\n" + " " + getDividend());
        } else {
            getPrintResult().append("\n" + getSpace().toString());
            printChar(" ", getNotFullDivisible().length() - Integer.toString(getDividend()).length());
            getPrintResult().append(getDividend());
        }
    }

    public void printChar(String s, int n) {
        for (int i = 0; i < n; i++) {
            getPrintResult().append(s);
        }
    }
}

