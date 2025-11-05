package org.multithreading.advancedmultithreading;

public class ThreadGroupDemo extends Thread{
    public void run(){
        System.out.println("Thread is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("Parent Thread Group");
        ThreadGroup tg2=new ThreadGroup(tg1,"Child Thread Group");

        Thread t1=new Thread(tg1,new ThreadGroupDemo(),"one");
        Thread t2=new Thread(tg1,new ThreadGroupDemo(),"two");
        Thread t3=new Thread(tg2,new ThreadGroupDemo(),"three");
        Thread t4=new Thread(tg2,new ThreadGroupDemo(),"four");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(tg1.activeCount());
        System.out.println("Thread Group Name of t1: "+t1.getThreadGroup().getName());
        System.out.println("Thread Group Name of t2: "+t2.getThreadGroup().getName());
        System.out.println("Thread Group Name of t3: "+t3.getThreadGroup().getName());
        System.out.println("Thread Group Name of t4: "+t4.getThreadGroup().getName());

        tg1.list();
    }
}
