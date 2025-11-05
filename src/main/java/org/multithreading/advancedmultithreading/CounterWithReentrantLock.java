package org.multithreading.advancedmultithreading;

import java.util.concurrent.locks.ReentrantLock;

public class CounterWithReentrantLock {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // acquire the lock
        try {
            count++;
        } finally {
            lock.unlock(); // release the lock
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        CounterWithReentrantLock counter = new CounterWithReentrantLock();

        // Create two threads that increment the counter 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
