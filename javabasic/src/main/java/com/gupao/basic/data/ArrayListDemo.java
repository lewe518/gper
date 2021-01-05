package com.gupao.basic.data;

import org.apache.commons.text.StringEscapeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yiliua
 * Create at: 2020/10/13
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("G");
        list.add("U");
        list.add("P");
        list.add("A");
        list.add("O");
        System.out.println(list);

        // 转换成线程安全的list
        List<String> syncList = Collections.synchronizedList(list);
        System.out.println(syncList);
    }
}
