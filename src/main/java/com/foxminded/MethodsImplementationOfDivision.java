package com.foxminded;

 public class MethodsImplementationOfDivision {
    public Integer dividend;
    public Integer divider;
    public int multiplier;
    public int dividendImmutable;
    public StringBuffer incompletePrivate;
    public StringBuffer remainingPartDividend;
    public StringBuffer incompletePrivateNew;
    public StringBuffer printResult;

    public MethodsImplementationOfDivision(Integer dividend, Integer divider) {
        if (divider > dividend) {
            System.out.println("Incorrect input");
            return;
        }
        if (dividend != null && divider != null) {
            this.dividend = Math.abs(dividend);
            this.divider = Math.abs(divider);
            this.printResult = new StringBuffer("");
            this.dividendImmutable = Math.abs(dividend);
        }
    }

    public void printSpace(String s, int n) {
        for (int i = 0; i < n; i++) {
            printResult.append(s);
        }
    }
    public int SearchIncompletePrivate() {
        int i = 1;
        while (Integer.parseInt(Integer.toString(this.dividend).substring(0, i)) < divider) {
            i++;
        }
        this.incompletePrivate = new StringBuffer(Integer.toString(this.dividend).substring(0, i));
        this.remainingPartDividend = new StringBuffer(Integer.toString(this.dividend).substring(i, Integer.toString(this.dividend).length()));
        return Integer.parseInt(this.incompletePrivate.toString());
    }

    public void ProcessOfFindingNumberGreaterThanDivider() {
        this.multiplier = this.SearchIncompletePrivate() / this.divider;
        this.incompletePrivateNew = new StringBuffer(Integer.toString(this.SearchIncompletePrivate() % this.divider));
        this.incompletePrivateNew.append(this.remainingPartDividend);
        dividend = Integer.parseInt(this.incompletePrivateNew.toString());
    }
}
