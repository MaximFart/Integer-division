package com.foxminded;

 public class ProcessDivision extends IntegerDivision {


     public ProcessDivision(Integer dividend, Integer divider) throws IllegalArgumentException {
         super(dividend, divider);
     }

     public int defineNotFullDivisible() {
        int i = 1;
        while (Integer.parseInt(Integer.toString(getDividend()).substring(0, i)) < getDivider()) {
            i++;
        }
        setMinuendValue(new StringBuffer(Integer.toString(getDividend()).substring(0, i)));
        setRemainingPartDividend(new StringBuffer(Integer.toString(getDividend()).substring(i, Integer.toString(getDividend()).length())));
        return Integer.parseInt(getMinuendValue().toString());
    }

    public void selectNextNotFullDivisible() {
        setMultiplier(defineNotFullDivisible() / getDivider());
        setNextMinuendValue(new StringBuffer(Integer.toString(defineNotFullDivisible() % getDivider())));
        getNextMinuendValue().append(getRemainingPartDividend());
        setDividend(Integer.parseInt(getNextMinuendValue().toString()));
    }
}
