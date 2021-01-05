package com.gupao.spring.factory.dynamic;

import com.gupao.spring.pojo.IPersonBean;
import com.gupao.spring.pojo.StudentBeanImpl;

/**
 * @author yiliua
 * Create at: 2020/12/23
 */
public class DynamicPersonFactory {
    public DynamicPersonFactory() {
        System.out.println("DynamicPersonFactory ctor");
    }

    public IPersonBean getInstance() {
        System.out.println("DynamicPersonFactory getInstance");
        return new StudentBeanImpl();
    }
}
