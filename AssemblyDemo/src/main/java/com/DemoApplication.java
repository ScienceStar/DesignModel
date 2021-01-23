package com;

import com.bean.GpCoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName DemoApplication
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/23 16:10
 * @Version V1.0
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        System.out.println(run.getBean(GpCoreService.class));
        GpCoreService bean = run.getBean(GpCoreService.class);
        bean.crudService();
    }
}
