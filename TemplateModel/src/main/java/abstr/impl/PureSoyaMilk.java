package abstr.impl;

import abstr.SoyaMilkWithHook;

/**
 * @program: designModel
 * @description: 纯豆浆
 * @author: liuxincheng
 * @create: 2019-04-03 13:46
 */
public class PureSoyaMilk extends SoyaMilkWithHook {
    @Override
    protected void addCondiments() {

    }

    @Override
    public boolean customerWantsCondiments() {
        return false;
    }

    @Override
    public void selectMaterial() {
        super.selectMaterial( );
    }
}