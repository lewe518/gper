package com.gupao.spring.config;

import com.gupao.spring.pojo.IPersonBean;
import com.gupao.spring.pojo.annotation.WorkerBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yiliua
 * Create at: 2020/12/27
 */
@Configuration
public class JavaConfig {
    @Bean
    public IPersonBean workerBean() {
        return new WorkerBeanImpl();
    }
}
