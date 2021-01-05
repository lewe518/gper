package com.gupao.basic.data;

import java.util.LinkedList;

/**
 * 链表：
 * 1. 灵活的空间要求，存储空间不要求连续
 * 2. 不支持下标访问，支持顺序遍历检索
 * 3. 增删效率高，只操作节点前后对应引用关系，无需移动元素
 *
 * @author yiliua
 * Create at: 2020/10/11
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = init();
        System.out.println(ll);

        String first = ll.getFirst();
        String last = ll.getLast();
        System.out.println(first);
        System.out.println(last);

        String second = ll.get(1);
        System.out.println(second);
    }

    private static LinkedList<String> init() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("P");
        ll.add("A");
        ll.add("O");

        ll.push("U");
        ll.push("G");
        return ll;
    }
}
