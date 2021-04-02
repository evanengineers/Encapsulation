package com.company;

public class Printer {

    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        if (this.tonerLevel > 0 && this.tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner() {
        int neededTonerAmount = 100 - this.tonerLevel;
        System.out.println("Toner level currently: " + this.tonerLevel);
        System.out.println("Now adding: "+ neededTonerAmount + " to refill.");
        this.tonerLevel += neededTonerAmount;
        System.out.println("Toner Level: " + this.tonerLevel);
    }

    public void print(int pages) {
        System.out.println("Now printing pages 1 - " + pages);
        numberOfPagesPrinted += pages;
        this.tonerLevel -= (pages * 2);
        System.out.println("Toner Level now: " + this.tonerLevel);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
