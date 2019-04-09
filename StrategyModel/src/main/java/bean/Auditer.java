package bean;

import inter.DoWorking;

/**
 * @program: designModel
 * @description: 审计员
 * @author: liuxincheng
 * @create: 2019-04-09 09:37
 */
public class Auditer {

    public DoWorking doWorking;//封装策略

    //审计
    public void audit(){
        doWorking.comeOn();
    }
}