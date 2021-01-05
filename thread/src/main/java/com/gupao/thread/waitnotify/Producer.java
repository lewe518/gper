package com.gupao.thread.waitnotify;

import lombok.SneakyThrows;

import java.util.Queue;

/**
 * @author yiliua
 * Create at: 2020/11/10
 */
public class Producer extends Thread {

    private final Queue<String> bags;
    private final int size;

    public Producer(Queue<String> bags, int size) {
        this.bags = bags;
        this.size = size;
    }

    @SneakyThrows
    @Override
    public void run() {
        int i = 0;
        while (true) {
            Thread.sleep(1000);
            i++;

            synchronized (bags) {
                while (bags.size() == size) {
                    System.out.println("bags is full");
                    bags.wait();
                }

                System.out.println("生产bag" + i);
                bags.add("bag" + i);
                bags.notifyAll();
            }
        }
    }
}
