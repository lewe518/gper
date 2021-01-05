package com.gupao.thread;

/**
 * @author yiliua
 * Create at: 2020/11/13
 */
@SuppressWarnings("all")
public class ThreadInterpretDemo {
    private volatile static boolean isStop = false;

    public static void main(String[] args) {
        // 外部变量控制线程终止
        Thread t1 = new Thread(() -> {
            while (!isStop) {
                System.out.println("Thread 1 keep running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread 1 stopped!!!");
        });
        // interrupt控制线程终止
        Thread t2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 2 keep running");
            }
            System.out.println("Thread 2 stopped!!!");
        });
        // 阻塞操作线程终止
        Thread t3 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 3 keep running");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread 3 stopped!!!");
            }
        });
        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isStop = true;
        t2.interrupt();
        t3.interrupt();
    }


}
