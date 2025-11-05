package org.multithreading.advancedmultithreading;

public class YeildExample {

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread 1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread 2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
