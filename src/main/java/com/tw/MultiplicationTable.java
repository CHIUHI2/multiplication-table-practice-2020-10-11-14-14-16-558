package com.tw;

public class MultiplicationTable {
    /*
    P : 1 min
    D : 1 min
    C : check if method returns null or string according to requirements
    A : review current logic and test case result, and fix bug
    */
    public String create(int from, int to) {
        return this.isValidInput(from, to) ? this.generateMultiplicationTableWithRange(from, to) : null ;
    }

    /*
    P : 1 min
    D : 1 min
    C : check if method returns correct boolean result after running all validation rule
    A : review current logic and test case result, and fix bug
    */
    private boolean isValidInput(int from, int to) {
        return this.isInputInRange(from) && this.isInputInRange(to) && this.isInputFromSmallerThanTo(from, to);
    }

    /*
    P : 1 min
    D : 1 min
    C : check if method returns true when input 'to' is >= input 'from'
    A : review current logic and test case result, and fix bug
    */
    private boolean isInputFromSmallerThanTo(int from, int to) {
        return to >= from;
    }

    /*
    P : 1 min
    D : 1 min
    C : check if method returns true when the input is >= 1 and <= 1000
    A : review current logic and test case result, and fix bug
    */
    private boolean isInputInRange(int input) {
        return input >= 1 && input <= 1000;
    }

    /*
    P : 6 mins
    D : 6 mins
    C : check if method returns multiplication table according to requirements
    A : review current logic and test case result, and fix bug
    */
    private String generateMultiplicationTableWithRange(int from, int to) {
        StringBuilder table = new StringBuilder();

        for(int index = from ; index < to + 1 ; index++) {
            table.append(table.toString().equals("") ? "" : "\r\n");
            table.append(this.generateMultiplicationTableRowWithRange(from, index));
        }

       return table.toString();
    }

    /*
    P : 6 mins
    D : 7 mins
    C : check if method returns multiplication table row according to requirements
    A : review current logic and test case result, and fix bug
    */
    private String generateMultiplicationTableRowWithRange(int from, int to) {
        StringBuilder row = new StringBuilder();

        for(int index = from ; index < to + 1 ; index++) {
            row.append(row.toString().equals("") ? "" : "  ");
            row.append(this.generateMultiplicationTableItemWithRange(index, to));
        }

        return row.toString();
    }

    /*
    P : 3 mins
    D : 3 mins
    C : check if method returns multiplication table item according to requirements
    A : review current logic and test case result, and fix bug
    */
    private String generateMultiplicationTableItemWithRange(int from, int to) {
        int multipleResult = from * to;

        return from + "*" + to + "=" + multipleResult;
    }
}
