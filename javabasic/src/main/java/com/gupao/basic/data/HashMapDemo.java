package com.gupao.basic.data;

import java.util.HashMap;

/**
 * @author yiliua
 * Create at: 2020/10/15
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("liuyi", "666");
        map.put("gupao", "good");

        System.out.println(map);
    }
}
