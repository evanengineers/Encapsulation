package com.company;

public class Main {

    public static void main(String[] args) {

        Printer myPrinter = new Printer(20, 0, true);

        System.out.println(myPrinter.getTonerLevel());

        myPrinter.print(20);

        myPrinter.print(2);
        myPrinter.fillUpToner();
    }
}
