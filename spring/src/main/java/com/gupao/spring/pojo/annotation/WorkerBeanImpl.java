package com.gupao.spring.pojo.annotation;

import com.gupao.spring.pojo.IPersonBean;

/**
 * @author yiliua
 * Create at: 2020/12/27
 */
public class WorkerBeanImpl implements IPersonBean {

    public String say() {
        return "I am a worker";
    }
}
