package com.foxminded;

public class Print extends MethodsDivision {

    public Print(Integer dividend, Integer divider) throws IllegalArgumentException {
        super(dividend, divider);
    }
    public void generalDivisionPrint() {
        headDivisionPrint();
        while (getDividend() >= getDivider()) {
            /*if (Integer.toString(this.createNotFullDivisible()).length() > Integer.toString(getMultiplier() * getDivider()).length()) {
                getPrintResult().append("\n" + getSpace().toString());
                //getPrintResult().deleteCharAt(getPrintResult().lastIndexOf(" "));
                getPrintResult().append("_" + this.createNotFullDivisible());
                selectNextNotFullDivisible();
                getPrintResult().append("\n" + getSpace().toString() + getMultiplier() * getDivider());
                getPrintResult().append("\n" + getSpace().toString());
                printChar("-", getNotFullDivisible().length());
            }else{
            */
            getPrintResult().append("\n" + getSpace().toString() + "_" + this.createNotFullDivisible());
            selectNextNotFullDivisible();
            getPrintResult().append("\n" + getSpace().toString() + " " + getMultiplier() * getDivider());
            getPrintResult().append("\n" + getSpace().toString() + " ");
            printChar("-", getNotFullDivisible().length());
            if (getNotFullDivisible().length() != Integer.toString((Integer.parseInt(getNotFullDivisible().toString())) % getDivider()).length()) {
                getSpace().append(" ");
            }
        }
        remainsDivisionPrint();
    }

    public void headDivisionPrint() {
        getPrintResult().append("_" + Integer.toString(getDividend()) + "|" + Integer.toString(getDivider()));
        int result = getDividend() / getDivider();
        this.createNotFullDivisible();
        selectNextNotFullDivisible();
        if (getNotFullDivisible().length() > Integer.toString(getMultiplier() * getDivider()).length()) {
            getPrintResult().append("\n" + getSpace().toString() + "  " + getMultiplier() * getDivider());
        } else if (getNotFullDivisible().length() == Integer.toString(getMultiplier() * getDivider()).length()) {
            getPrintResult().append("\n" + getSpace().toString() + " " + getMultiplier() * getDivider());
        }
        printChar(" ", getRemainingPartDividend().length());
        getPrintResult().append("|");
        printChar("-", Integer.toString(getDividend()).length());

        getPrintResult().append("\n" + getSpace().toString() + " ");
        printChar("-", getNotFullDivisible().length());
        printChar(" ", getRemainingPartDividend().length());
        getPrintResult().append("|" + result);
        getSpace().append(" ");
    }

    public void remainsDivisionPrint() {
        if (Integer.toString(getDividendImmutable()).length() == 1) {
            getPrintResult().append("\n" + " " + getDividend());
        } else {
            getPrintResult().append("\n" + getSpace().toString());
            //if (Integer.toString(getDividend()).length() == 1) {
//
  //              getPrintResult().deleteCharAt(getPrintResult().lastIndexOf(" "));
    //        }
            printChar(" ", getNotFullDivisible().toString().length() - Integer.toString(getDividend()).length());
            getPrintResult().append(" " + getDividend());
        }
    }

    public void printChar(String s, int n) {
        for (int i = 0; i < n; i++) {
            getPrintResult().append(s);
        }
    }
}

