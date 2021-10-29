package com.foxminded;

class IntegerDivision {

    private Integer dividend;
    private Integer divider;
    private int multiplier;
    private int dividendImmutable;
    private StringBuffer minuendValue;
    private StringBuffer remainingPartDividend;
    private StringBuffer nextMinuendValue;
    private StringBuffer printResult;
    private StringBuffer space = new StringBuffer("");

    public IntegerDivision(Integer dividend, Integer divider) throws IllegalArgumentException {
        if (dividend == null || divider == null) {
            throw new IllegalArgumentException("Input is null");
        }
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

    public StringBuffer getRemainingPartDividend() {
        return remainingPartDividend;
    }

    public void setRemainingPartDividend(StringBuffer remainingPartDividend) {
        this.remainingPartDividend = remainingPartDividend;
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

    public StringBuffer getMinuendValue() {
        return minuendValue;
    }

    public void setMinuendValue(StringBuffer minuendValue) {
        this.minuendValue = minuendValue;
    }

    public StringBuffer getNextMinuendValue() {
        return nextMinuendValue;
    }

    public void setNextMinuendValue(StringBuffer nextMinuendValue) {
        this.nextMinuendValue = nextMinuendValue;
    }
}
