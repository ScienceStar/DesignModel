package bean;

import inter.DoWorking;

/**
 * @program: designModel
 * @description: 客户端职员
 * @author: liuxincheng
 * @create: 2019-04-09 09:25
 */
public class Employee {

    public DoWorking doWorking;//组合方式使用策略

    public void startWork(){
        doWorking.comeOn();
    }
}