package com.gupao.thread;

/**
 * @author yiliua
 * Create at: 2020/11/10
 */
@SuppressWarnings("all")
public class ThreadJoinDemo {
    private static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            x = 1;
        });
        Thread thread2 = new Thread(() -> {
            x = 2;
        });

        thread1.start();
        thread1.join();// 线程阻塞等待thread1执行完毕
        thread2.start();

        Thread.sleep(1000);
        System.out.println(x);
    }
}
