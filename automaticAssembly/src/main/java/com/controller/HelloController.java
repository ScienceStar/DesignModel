package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/23 14:21
 * @Version V1.0
 **/
@RestController
public class HelloController {

    @GetMapping("say")
    public String sayHello(){
        System.out.println("welcom ");
        return "welcome to C world";
    }
}
