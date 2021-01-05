package com.gupao.basic.data;

import java.util.Vector;

/**
 * Vector集合
 * <p>
 * 线程安全的，每个操作方法都加了synchronized，对性能影响大，慢慢被放弃使用
 *
 * @author yiliua
 * Create at: 2020/10/13
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("G");
        System.out.println(vector);
    }
}
