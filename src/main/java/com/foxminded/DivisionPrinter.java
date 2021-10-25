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
        printChar("-", Integer.toString(getDividend()).length());
        getPrintResult().append("\n" + getSpace().toString() + " ");
        printChar("-", getMinuendValue().length());
        printChar(" ", getRemainingPartDividend().length());
        getPrintResult().append("|" + result);
        if (getMinuendValue().length() != Integer.toString(getMultiplier() % getDivider()).length()) {

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
            printChar(" ", getMinuendValue().toString().length() - getNextMinuendValue().toString().length());
            getPrintResult().append(getDividend());
        }
    }

    public void printChar(String s, int n) {
        for (int i = 0; i < n; i++) {
            getPrintResult().append(s);
        }
    }
}

