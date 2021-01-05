package com.gupao.thread.create;

/**
 * @author yiliua
 * Create at: 2020/11/1
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Current thread name is " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new ThreadDemo();
        thread.start();
    }
}
