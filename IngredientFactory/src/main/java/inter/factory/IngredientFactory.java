package inter.factory;

import inter.bean.*;

public interface IngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Vegetable createVegetable();
    Meat createMeat();
    Seafood createSeafood();
}
