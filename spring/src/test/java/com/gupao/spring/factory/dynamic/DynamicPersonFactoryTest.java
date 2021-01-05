package com.gupao.spring.factory.dynamic;

import com.gupao.spring.pojo.IPersonBean;
import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yiliua
 * Create at: 2020/12/23
 */
public class DynamicPersonFactoryTest extends TestCase {

    public void testGetInstance() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-dynamic.xml");
        IPersonBean bean = (IPersonBean) applicationContext.getBean("dynamicBean");
        Assert.assertEquals(bean.say(), "I am a student");
    }
}