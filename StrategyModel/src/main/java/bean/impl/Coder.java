package bean.impl;

import bean.Employee;
import inter.impl.Coding;

/**
 * @program: designModel
 * @description: 客户端程序员
 * @author: liuxincheng
 * @create: 2019-04-09 09:30
 */
public class Coder extends Employee {

    public Coder(){
        doWorking = new Coding();
    }
}