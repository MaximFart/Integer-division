package com.foxminded;

public class DivisionPrinter extends ProcessDivision {

    public DivisionPrinter(Integer dividend, Integer divider) throws IllegalArgumentException {
        super(dividend, divider);
    }

    public void printGeneralDivision() {
        printHeadDivision();
        while (getDividend() >= getDivider()) {
            if (Integer.parseInt(getMinuendValue().toString()) == (getMultiplier() * getDivider())) {
                getSpace().append(" ");
            }else if (getMinuendValue().length() - Integer.toString(Integer.parseInt(getMinuendValue().toString()) % getDivider()).length() == 2) {
                getSpace().append(" ");
            }
            getPrintResult().append("\n" + getSpace().toString() + "_" + this.defineNotFullDivisible());
            selectNextNotFullDivisible();
            if (getMinuendValue().length() > Integer.toString(getMultiplier() * getDivider()).length()) {
                getPrintResult().append("\n" + getSpace().toString() + "  " + getMultiplier() * getDivider());
            } else {
                getPrintResult().append("\n" + getSpace().toString() + " " + getMultiplier() * getDivider());
            }
            getPrintResult().append("\n" + getSpace().toString() + " ");
            printChar("-", getMinuendValue().length());
            if (getMinuendValue().length() != Integer.toString(Integer.parseInt(getMinuendValue().toString()) % getDivider()).length())
            getSpace().append(" ");
        }
        printRemainsDivision();
    }

    public void printHeadDivision() {
        getPrintResult().append("_" + Integer.toString(getDividend()) + "|" + Integer.toString(getDivider()));
        int result = getDividend() / getDivider();
        this.defineNotFullDivisible();
        selectNextNotFullDivisible();
        if (getMinuendValue().length() > Integer.toString(getMultiplier() * getDivider()).length()) {
            getPrintResult().append("\n" + getSpace().toString() + "  " + getMultiplier() * getDivider());
        } else if (getMinuendValue().length() == Integer.toString(getMultiplier() * getDivider()).length()) {
            getPrintResult().append("\n" + getSpace().toString() + " " + getMultiplier() * getDivider());
        }
        printChar(" ", getRemainingPartDividend().length());
        getPrintResult().append("|");
        if (getDivider() >= result) {
            printChar("-", Integer.toString(getDivider()).length());
        } else {
            printChar("-", Integer.toString(result).length());
        }
        getPrintResult().append("\n" + getSpace().toString() + " ");
        printChar("-", getMinuendValue().length());
        printChar(" ", getRemainingPartDividend().length());
        getPrintResult().append("|" + result);
        if (getMinuendValue().length() == Integer.toString(getMultiplier() * getDivider()).length()) {
            printCharSpace(getMinuendValue().length() - Integer.toString(Integer.parseInt(getMinuendValue().toString()) % getDivider()).length());
        } else {
            getSpace().append(" ");
        }

    }

    public void printRemainsDivision() {
        if (Integer.toString(getDividendImmutable()).length() == 1) {
            getPrintResult().append("\n" + " " + getDividend());
        } else {
            if (Integer.parseInt(getMinuendValue().toString()) == (getMultiplier() * getDivider()) && getRemainingPartDividend().length() != 0) {
                getSpace().append(" ");
            }
            getPrintResult().append("\n" + getSpace().toString());
            printChar(" ", getMinuendValue().toString().length() - Integer.toString(Integer.parseInt(getMinuendValue().toString()) % getDivider()).length());
            getPrintResult().append(getDividend());
        }
    }

    public void printChar(String s, int n) {
        for (int i = 0; i < n; i++) {
            getPrintResult().append(s);
        }
    }

    public void printCharSpace(int n) {
        String space = " ";
        for (int i = 0; i < n; i++) {
            getSpace().append(space);
        }
    }
}

