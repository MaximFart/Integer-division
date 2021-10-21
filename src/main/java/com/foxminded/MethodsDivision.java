package com.foxminded;

 public class MethodsDivision extends IntegerDivision {


     public MethodsDivision(Integer dividend, Integer divider) throws IllegalArgumentException {
         super(dividend, divider);
     }

     public int createNotFullDivisible() {
        int i = 1;
        while (Integer.parseInt(Integer.toString(getDividend()).substring(0, i)) < getDivider()) {
            i++;
        }
        setNotFullDivisible(new StringBuffer(Integer.toString(getDividend()).substring(0, i)));
        setRemainingPartDividend(new StringBuffer(Integer.toString(getDividend()).substring(i, Integer.toString(getDividend()).length())));
        return Integer.parseInt(getNotFullDivisible().toString());
    }

    public void selectNextNotFullDivisible() {
        setMultiplier(createNotFullDivisible() / getDivider());
        setNextNotFullDivisible(new StringBuffer(Integer.toString(createNotFullDivisible() % getDivider())));
        getNextNotFullDivisible().append(getRemainingPartDividend());
        setDividend(Integer.parseInt(getNextNotFullDivisible().toString()));
    }
}
