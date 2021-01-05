package com.gupao.spring.pojo;

/**
 * @author yiliua
 * Create at: 2020/12/23
 */
public class StudentBeanImpl implements IPersonBean {
    public StudentBeanImpl() {
        System.out.println("StudentBeanImpl ctor");
    }

    public String say() {
        return "I am a student";
    }
}
