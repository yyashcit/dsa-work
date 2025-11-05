package org.multithreading.advancedmultithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceDemoWithCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return "call method is called";
    }


    public static void main(String[] args) {
        ExecuteServiceDemoWithCallable obj[]={new ExecuteServiceDemoWithCallable(),new ExecuteServiceDemoWithCallable(),
                new ExecuteServiceDemoWithCallable(),new ExecuteServiceDemoWithCallable()};
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(ExecuteServiceDemoWithCallable o:obj){
            try {
                System.out.println(executorService.submit(o).get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        executorService.shutdown();
    }
}
