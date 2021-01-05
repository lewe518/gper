package com.gupao.spring.factory;

import com.gupao.spring.pojo.IPersonBean;
import com.gupao.spring.pojo.TeacherBeanImpl;

/**
 * @author yiliua
 * Create at: 2020/12/23
 */
public class StaticPersonFactory {
    public static IPersonBean getInstance() {
        return new TeacherBeanImpl();
    }
}
