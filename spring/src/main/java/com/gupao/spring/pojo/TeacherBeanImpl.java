package com.gupao.spring.pojo;

/**
 * @author yiliua
 * Create at: 2020/12/23
 */
public class TeacherBeanImpl implements IPersonBean {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TeacherBeanImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TeacherBeanImpl() {
    }

    public String say() {
        return "I am a teacher";
    }

    @Override
    public String toString() {
        return "TeacherBeanImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
