package org.multithreading.advancedmultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemoWithRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
    ExecutorService service= Executors.newFixedThreadPool(2);

        System.out.println(Thread.activeCount());
        service.shutdown();
    }
}
