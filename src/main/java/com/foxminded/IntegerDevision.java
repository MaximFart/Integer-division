package com.foxminded;

class IntegerDivision {

    private Integer dividend;
    private Integer divider;
    private int multiplier;
    private int dividendImmutable;
    private StringBuffer notFullDivisible;
    private StringBuffer remainingPartDividend;
    private StringBuffer NextNotFullDivisible;
    private StringBuffer printResult;
    private StringBuffer space = new StringBuffer("");

    public IntegerDivision(Integer dividend, Integer divider) throws IllegalArgumentException {
        if (divider > dividend) {
            throw new IllegalArgumentException("Incorrect input");
        }
        if (dividend != null && divider != null) {
            this.dividend = Math.abs(dividend);
            this.divider = Math.abs(divider);
            this.printResult = new StringBuffer("");
            this.dividendImmutable = Math.abs(dividend);
        }
    }

    public Integer getDividend() {
        return dividend;
    }

    public void setDividend(Integer dividend) {
        this.dividend = dividend;
    }

    public Integer getDivider() {
        return divider;
    }

    public void setDivider(Integer divider) {
        this.divider = divider;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getDividendImmutable() {
        return dividendImmutable;
    }

    public void setDividendImmutable(int dividendImmutable) {
        this.dividendImmutable = dividendImmutable;
    }

    public StringBuffer getNotFullDivisible() {
        return notFullDivisible;
    }

    public void setNotFullDivisible(StringBuffer notFullDivisible) {
        this.notFullDivisible = notFullDivisible;
    }

    public StringBuffer getRemainingPartDividend() {
        return remainingPartDividend;
    }

    public void setRemainingPartDividend(StringBuffer remainingPartDividend) {
        this.remainingPartDividend = remainingPartDividend;
    }

    public StringBuffer getNextNotFullDivisible() {
        return NextNotFullDivisible;
    }

    public void setNextNotFullDivisible(StringBuffer nextNotFullDivisible) {
        NextNotFullDivisible = nextNotFullDivisible;
    }

    public StringBuffer getPrintResult() {
        return printResult;
    }

    public void setPrintResult(StringBuffer printResult) {
        this.printResult = printResult;
    }

    public StringBuffer getSpace() {
        return space;
    }

    public void setSpace(StringBuffer space) {
        this.space = space;
    }
}
