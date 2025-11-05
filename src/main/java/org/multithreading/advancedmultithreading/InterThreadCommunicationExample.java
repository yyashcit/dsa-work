package org.multithreading.advancedmultithreading;
public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}

class SharedBuffer {
    int data;
    boolean hasValue = false;

    // Producer writes data
    synchronized void produce(int value) {
        while (hasValue) {
            try { wait(); } catch (InterruptedException e) { }
        }
        data = value;
        hasValue = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    // Consumer reads data
    synchronized int consume() {
        while (!hasValue) {
            try { wait(); } catch (InterruptedException e) { }
        }
        hasValue = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer
        return data;
    }
}