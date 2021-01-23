package com.config;

import com.bean.GpCoreService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GpConfiguration
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/23 15:45
 * @Version V1.0
 **/
@Configuration
public class GpConfiguration {

    @Bean
    public GpCoreService gpCoreService(){
        return new GpCoreService();
    }
}
