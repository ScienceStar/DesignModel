package decorator;

import component.Tea;
import component.impl.CondimentDecorator;

/**
 * @program: designModel
 * @description: 咖啡配料
 * @author: liuxincheng
 * @create: 2019-04-01 10:13
 */
public class Coffe extends CondimentDecorator {

    //持有对象
    private Tea tea;

    public Coffe(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return "咖啡"+tea.getDescrption();
    }

    @Override
    public double getTeaCost() {
        return 2.0+tea.getTeaCost();
    }
}