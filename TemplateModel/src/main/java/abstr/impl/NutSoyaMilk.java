package abstr.impl;

import abstr.SoyaMilk;

/**
 * @program: designModel
 * @description: 核桃豆浆
 * @author: liuxincheng
 * @create: 2019-04-03 10:53
 */
public class NutSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        System.out.println("第二步: 添加核桃原料" );
    }
}