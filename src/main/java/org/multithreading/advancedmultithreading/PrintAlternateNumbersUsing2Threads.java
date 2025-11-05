package org.multithreading.advancedmultithreading;

class Printer {
private int number = 1;
private final int MAX = 10;
private boolean isOddTurn = true;

public synchronized void printOdd() {
    System.out.println("Odd Thread started");
    while (number <= MAX) {
        while (!isOddTurn) {
            try { wait(); } catch (InterruptedException e) { }
        }
        System.out.println("Odd Thread: " + number);
        number++;
        isOddTurn = false;
        notify();
    }
}

public synchronized void printEven() {
    System.out.println("Even Thread started");
    while (number <= MAX) {
        while (isOddTurn) {
            try { wait(); } catch (InterruptedException e) { }
        }
        System.out.println("Even Thread: " + number);
        number++;
        isOddTurn = true;
        notify();
    }
}
}

public class PrintAlternateNumbersUsing2Threads {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    }
}
