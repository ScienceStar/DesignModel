package abstr.impl;

import abstr.SoyaMilk;

/**
 * @program: designModel
 * @description: 红枣豆浆
 * @author: liuxincheng
 * @create: 2019-04-03 10:50
 */
public class ReddatesSoyaMilk extends SoyaMilk {

    @Override
    public void addCondiments() {
        System.out.println("第二步、添加红枣配料");
    }
}