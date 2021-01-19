package inter.impl;

import inter.ICaculate;

/**
 * @ClassName CaculateImpl
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/19 14:34
 * @Version V1.0
 **/
public class CaculateImpl implements ICaculate {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int mul(int a, int b) {
        return a-b;
    }
}
