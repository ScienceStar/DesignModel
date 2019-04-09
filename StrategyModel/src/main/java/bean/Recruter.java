package bean;

import inter.DoWorking;

/**
 * @program: designModel
 * @description: 招聘抽象类
 * @author: liuxincheng
 * @create: 2019-04-09 09:49
 */
public abstract class Recruter {

    public DoWorking doWorking;//组合方式封装策略

    public void recruting(){
        doWorking.comeOn();
    }
}