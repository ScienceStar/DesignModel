package inter.impl;

import inter.Bird;

/**
 * @program: designModel
 * @description: 鹦鹉实现类
 * @author: liuxincheng
 * @create: 2019-04-02 13:41
 */
public class Parrot implements Bird {
    @Override
    public void chirp() {
        System.out.println("呜呜呜............");
    }

    @Override
    public void fly() {
        System.out.println("我可以飞很远.............");
    }
}