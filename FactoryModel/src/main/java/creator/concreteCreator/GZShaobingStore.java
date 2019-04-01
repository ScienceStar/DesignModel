package creator.concreteCreator;

import creator.ShaobingStore;
import creator.concreteProduct.GZBeefShaobing;
import creator.concreteProduct.GZOnionShaobing;
import product.Shaobing;

/**
 * @program: designModel
 * @description: 广州烧饼店
 * @author: liuxincheng
 * @create: 2019-04-01 14:19
 */
public class GZShaobingStore extends ShaobingStore {

    private Shaobing shaobing = null;
    @Override
    public Shaobing createShaobing(String type) {

        switch (type){
            case "onion":
                shaobing = new GZOnionShaobing();
                break;
            case "beef":
                shaobing = new GZBeefShaobing();
                break;
                default:
                    break;
        }
        return shaobing;
    }
}