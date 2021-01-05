package com.gupao.spring;

import com.gupao.spring.config.JavaConfig;
import com.gupao.spring.pojo.IPersonBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yiliua
 * Create at: 2020/12/27
 */
public class AnnoTest {
    @Test
    public void testIoC() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        IPersonBean bean1 = ac.getBean("workerBean", IPersonBean.class);
        Assert.assertEquals(bean1.say(), "I am a worker");

        IPersonBean bean2 = ac.getBean("workerBean", IPersonBean.class);

    }
}
