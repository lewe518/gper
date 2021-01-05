package com.gupao.thread.create;

/**
 * @author yiliua
 * Create at: 2020/11/1
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Current thread name is " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnableDemo runnable = new RunnableDemo();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
