package inter.impl.factory;

import inter.bean.*;
import inter.factory.IngredientFactory;
import inter.impl.bean.DBDough;
import inter.impl.bean.Onion;
import inter.impl.bean.TomatoSauce;

/**
 * @program: designModel
 * @description: 烧饼工厂
 * @author: liuxincheng
 * @create: 2019-04-02 09:09
 */
public class ShaobingIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new DBDough();//东北面粉
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();//番茄酱
    }

    @Override
    public Vegetable createVegetable() {
        return new Onion();//洋葱
    }

    @Override
    public Meat createMeat() {
        return null;
    }

    @Override
    public Seafood createSeafood() {
        return null;
    }
}