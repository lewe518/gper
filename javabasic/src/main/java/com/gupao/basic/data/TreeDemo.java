package com.gupao.basic.data;

import java.util.TreeMap;

/**
 * 树：
 * 1. 某节点的左子树节点值仅包含小于该节点值
 * 2. 某节点的右子树节点值仅包含大于该节点值
 * 3. 左右子树每个也必须是二叉查找树
 * 4. 顺序排列
 *
 * @author yiliua
 * Create at: 2020/10/11
 */
public class TreeDemo {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("liuyi", "666");
        treeMap.put("gupao", "good");

        System.out.println(treeMap);
    }
}
