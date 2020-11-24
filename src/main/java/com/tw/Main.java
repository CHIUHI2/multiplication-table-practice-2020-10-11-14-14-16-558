package com.tw;

public class Main {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        String result = multiplicationTable.create(2, 4);
        System.out.println(result);
    }
}
