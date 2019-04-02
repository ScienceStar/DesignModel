package inter.impl.bean;

import inter.bean.Shaobing;
import inter.factory.IngredientFactory;
import inter.impl.factory.ShaobingIngredientFactory;

/**
 * @program: designModel
 * @description: 洋葱烧饼
 * @author: liuxincheng
 * @create: 2019-04-02 09:15
 */
public class OnionShaobing extends Shaobing {

    //原材料 抽象工厂
    IngredientFactory ingredientFactory;

    public OnionShaobing(){
        ingredientFactory = new ShaobingIngredientFactory();
    }
    @Override
    public void prepare() {
        System.out.println("洋葱烧饼开始准备原材料");
        name="洋葱烧饼";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        vegetable = ingredientFactory.createVegetable();
    }
}