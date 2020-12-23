package inter.impl;

import inter.DoWorking;

/**
 * @program: designModel
 * @description: 招聘类
 * @author: liuxincheng
 * @create: 2019-04-09 09:20
 */
public class Recruiting implements DoWorking {
    @Override
    public void comeOn() {
        System.out.println("正在招聘................." );
    }

    @Override
    public void doSth() {
        System.out.println("我正在招聘......");
    }
}
