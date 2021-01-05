package com.gupao.thread.waitnotify;

import lombok.SneakyThrows;

import java.util.Queue;

/**
 * @author yiliua
 * Create at: 2020/11/11
 */
public class Consumer extends Thread {

    private final int size;
    private final Queue<String> bags;

    public Consumer(Queue<String> bags, int size) {
        this.bags = bags;
        this.size = size;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            Thread.sleep(3000);
            synchronized (bags) {
                while (bags.isEmpty()) {
                    System.out.println("bags is empty");
                    bags.wait();
                }

                String bag = bags.remove();
                System.out.println("消费" + bag);
                bags.notifyAll();
            }
        }
    }
}
