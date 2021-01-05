package com.gupao.thread.waitnotify;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yiliua
 * Create at: 2020/11/11
 */
@SuppressWarnings("all")
public class ThreadWaitNotifyDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int size = 10;

        Producer producer = new Producer(queue, size);
        Consumer consumer = new Consumer(queue, size);

        producer.start();
        consumer.start();
    }
}
