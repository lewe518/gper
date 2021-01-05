package com.gupao.spring;

import com.gupao.spring.pojo.IPersonBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yiliua
 * Create at: 2020/12/23
 */
public class StaticFactoryBeanTest {
    @Test
    public void testGetBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-static.xml");
        IPersonBean bean = (IPersonBean) applicationContext.getBean("factoryBeanId");
        Assert.assertEquals(bean.say(), "I am a teacher");
    }
}
