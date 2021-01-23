package com.config;

import com.bean.DemoClass;
import com.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName DemoConfiguration
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/23 15:11
 * @Version V1.0
 **/
@Configuration
@Import(User.class)
public class DemoConfiguration {

    @Bean
    public DemoClass getDemoClass(){
        return new DemoClass();
    }
}
