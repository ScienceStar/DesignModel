package component.impl;

import component.Tea;

/**
 * @program: designModel
 * @description: 奶茶组件
 * @author: liuxincheng
 * @create: 2019-04-01 10:06
 */
public class MilkTea extends Tea {

    public MilkTea() {
        descrption="奶茶";
    }

    @Override
    public double getTeaCost() {
        return 3.0;
    }
}