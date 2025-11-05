package org.multithreading.advancedmultithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {

        // Shared BlockingQueue with capacity 3
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        // Producer thread
        Thread producer = new Thread(() -> {
            int i = 1;
            try {
                while (i <= 5) {
                    System.out.println("Producing: " + i);
                    queue.put(i); // waits if queue is full
                    Thread.sleep(500); // simulate time to produce
                    i++;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int value = queue.take(); // waits if queue is empty
                    System.out.println("Consumed: " + value);
                    Thread.sleep(800); // simulate time to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}