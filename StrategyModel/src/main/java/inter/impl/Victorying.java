package inter.impl;

import inter.DoWorking;

/**
 * @ClassName Victorying
 * @Description: TODO
 * @Author lxc
 * @Date 2020/4/8 11:43
 * @Version V1.0
 **/
public class Victorying implements DoWorking {
    @Override
    public void comeOn() {
        System.out.println("我将于5分钟过来!");
    }

    @Override
    public void doSth() {
        System.out.println("我正在服务顾客..........");
    }
}
