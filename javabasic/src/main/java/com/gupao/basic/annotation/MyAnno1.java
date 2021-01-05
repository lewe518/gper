package com.gupao.basic.annotation;

/**
 * @author yiliua
 * Create at: 2020/11/1
 */
public @interface MyAnno1 {
    String name();

    int age() default 18;
}
