package com.gupao.thread.create;

import java.util.concurrent.*;

/**
 * @author yiliua
 * Create at: 2020/11/1
 */
public class CallableDemo implements Callable<String> {
    @Override
    public String call() {
        System.out.println("Current thread name is " + Thread.currentThread().getName());
        return "Hello";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<String> future = service.submit(new CallableDemo());
        String result = future.get();
        System.out.println(result);
    }
}
