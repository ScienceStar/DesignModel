package decorator;

import component.Tea;
import component.impl.CondimentDecorator;

/**
 * @program: designModel
 * @description: 珍珠奶茶配料
 * @author: liuxincheng
 * @create: 2019-04-01 10:09
 */
public class Pearl extends CondimentDecorator {

    //持有对装饰对象的引用
    private Tea tea;

    public Pearl(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescrption() {
        return "珍珠,"+tea.getDescrption();
    }

    @Override
    public double getTeaCost() {
        //茶的价格+珍珠的价格
        return 1.0+tea.getTeaCost();
    }
}