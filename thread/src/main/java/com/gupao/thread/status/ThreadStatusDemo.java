package com.gupao.thread.status;

import java.util.concurrent.TimeUnit;

/**
 * @author yiliua
 * Create at: 2020/11/4
 */
@SuppressWarnings("all")
public class ThreadStatusDemo {
    public static void main(String[] args) {
        // TIMED_WAITING
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "TIMED_WAITING-03").start();

        // WAITING
        new Thread(() -> {
            while (true) {
                synchronized (ThreadStatusDemo.class) {
                    try {
                        ThreadStatusDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "WAITING-04").start();

        //  TIMED_WAITING/BLOCKED
        new Thread(new BlockThread(), "Block-Thread-01").start();
        new Thread(new BlockThread(), "Block-Thread-02").start();
    }

    public static class BlockThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (ThreadStatusDemo.class) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
