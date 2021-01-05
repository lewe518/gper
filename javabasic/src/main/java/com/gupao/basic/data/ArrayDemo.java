package com.gupao.basic.data;

/**
 * 数组:
 * 1. 内存地址连续，使用前必须要指定数组长度
 * 2. 可以通过下标访问的方式访问成员，查询效率高
 * 3. 增删操作会给系统带来系统性能消耗
 *
 * @author yiliua
 * Create at: 2020/10/11
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 初始化方式1
        char[] cs1 = new char[]{'G', 'U', 'P', 'A', 'O'};
        System.out.println(cs1);

        // 初始化方式2
        char[] cs2 = new char[5];
        cs2[0] = 'G';
        cs2[1] = 'U';
        cs2[2] = 'P';
        cs2[3] = 'A';
        cs2[4] = 'O';
        System.out.println(cs2);
    }
}
