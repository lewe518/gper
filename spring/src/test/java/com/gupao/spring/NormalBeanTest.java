package com.gupao.spring;

import com.gupao.spring.pojo.IPersonBean;
import com.gupao.spring.pojo.StudentBeanImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author yiliua
 * Create at: 2020/12/23
 */
public class NormalBeanTest {
    @Test
    public void testBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean by id
        StudentBeanImpl userBean1 = (StudentBeanImpl) applicationContext.getBean("stuBeanId");
        Assert.assertEquals(userBean1.say(), "I am a student");

        // get bean by name
        StudentBeanImpl userBean2 = (StudentBeanImpl) applicationContext.getBean("stuBeanName1");
        Assert.assertEquals(userBean2.say(), "I am a student");
        StudentBeanImpl userBean3 = (StudentBeanImpl) applicationContext.getBean("stuBeanName2");
        Assert.assertEquals(userBean3.say(), "I am a student");

        // get bean by primary type
        IPersonBean userBean4 = applicationContext.getBean(IPersonBean.class);
        Assert.assertEquals(userBean4.say(), "I am a student");

        // get beans by type
        Map<String, IPersonBean> persons = applicationContext.getBeansOfType(IPersonBean.class);
        Assert.assertEquals(persons.get("stuBeanId").say(), "I am a student");
        Assert.assertEquals(persons.get("teacherBeanId").say(), "I am a teacher");
    }

    @Test
    public void testCtor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-ctor.xml");
        System.out.println(applicationContext.getBean("bean1"));

        System.out.println(applicationContext.getBean("bean2"));

        System.out.println(applicationContext.getBean("bean3"));

    }
}