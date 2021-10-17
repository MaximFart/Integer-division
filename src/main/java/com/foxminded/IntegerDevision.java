package com.foxminded;

class IntegerDivision extends MethodsImplementationOfDivision {

    public IntegerDivision(int dividend, int divider) {
        super(dividend, divider);
    }

    public void resultingDivisionProcess() {
        this.printResult.append("_" + Integer.toString(this.dividend) + "|" + Integer.toString(this.divider));
        int result = this.dividend / this.divider;
        StringBuffer space = new StringBuffer("");
        int i = 1;
        while (this.dividend >= this.divider) {
            if (i == 1) {
                this.printResult.append("\n" + space.toString() + "_" + this.SearchIncompletePrivate());
                printSpace(" ", Integer.toString(this.dividend).length() - this.incompletePrivate.length());
                this.printResult.append("|");
                printSpace("-", Integer.toString(this.dividend).length());
                ProcessOfFindingNumberGreaterThanDivider();
                this.printResult.append("\n" + space.toString() + " " + this.multiplier * divider);
                printSpace(" ", Integer.toString(this.dividend).length() + 1 - this.incompletePrivate.length());
                this.printResult.append("|" + result);
                this.printResult.append("\n" + space.toString() + " ");
                printSpace("-", this.incompletePrivate.length());
                space.append(" ");
                i++;
                continue;
            }
            this.printResult.append("\n" + space.toString() + "_" + this.SearchIncompletePrivate());
            ProcessOfFindingNumberGreaterThanDivider();
            this.printResult.append("\n" + space.toString() + " " + this.multiplier * divider);
            this.printResult.append("\n" + space.toString() + " ");
            printSpace("-", this.incompletePrivate.length());
            space.append(" ");
        }
        if (Integer.toString(this.dividendImmutable).length() == 1) {
            this.printResult.append("\n" + " " + this.dividend);
        } else {
            this.printResult.append("\n" + space.toString() + " " + this.dividend);
        }
    }
}
