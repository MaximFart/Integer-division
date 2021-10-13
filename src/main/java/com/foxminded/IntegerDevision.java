package com.foxminded;

class   IntegerDivision {
    public int dividend;
    public int divider;
    public int n;
    public int dividendFinal;
    public StringBuffer leftSbDividend;
    public StringBuffer rightSbDividend;
    public StringBuffer sbDividend;
    public StringBuffer sbDivider;
    public static StringBuffer print;
    public IntegerDivision(int dividend, int divider) {
        this.dividend = dividend;
        this.divider = divider;
        this.sbDividend = new StringBuffer(Integer.toString(this.dividend));
        this.sbDivider = new StringBuffer(Integer.toString(this.divider));
        this.print = new StringBuffer("");
        this.dividendFinal = dividend;
    }

    public void printSpace(String s, int n) {
        for (int i = 0; i < n; i++) {
            print.append(s);
        }
    }

    public void divisionResult() {
        print.append(sbDividend + "|" + sbDivider + "\n");
        printSpace(" ", sbDividend.length());
        print.append("|");
        printSpace("-", sbDividend.length());

        int result = this.dividend / this.divider;
        print.append("\n");
        printSpace(" ", sbDividend.length());
        print.append("|" + result);
        StringBuffer space = new StringBuffer("");

        for (; this.dividend >= this.divider;) {
            print.append("\n" + space.toString() + this.incompletePrivate());
            count();
            print.append("\n" + space.toString() + this.n * divider);
            print.append("\n" + space.toString());
            printSpace("-", this.leftSbDividend.length());
            space.append(" ");
        }
        if (Integer.toString(this.dividendFinal).length() == 1) {
            print.append("\n" + this.dividend);
        } else {
            print.append("\n" + space.toString() + this.dividend);
        }
    }

    public int incompletePrivate() {
        int i = 1;
        while (Integer.parseInt(Integer.toString(this.dividend).substring(0, i)) < divider) {
            i++;
        }
        this.leftSbDividend = new StringBuffer(Integer.toString(this.dividend).substring(0, i));
        this.rightSbDividend = new StringBuffer(Integer.toString(this.dividend).substring(i, Integer.toString(this.dividend).length()));
        return Integer.parseInt(this.leftSbDividend.toString());
    }

    public void count() {
        this.n = this.incompletePrivate() / this.divider;
        this.sbDividend = new StringBuffer(Integer.toString(this.incompletePrivate() % this.divider));
        this.sbDividend.append(this.rightSbDividend);
        dividend = Integer.parseInt(this.sbDividend.toString());
    }

    public static void main(String[] args) {
        IntegerDivision integerDivision = new IntegerDivision(512,8);
        integerDivision.divisionResult();
        System.out.println(print);
    }
}
