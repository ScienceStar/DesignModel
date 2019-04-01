package creator.concreteCreator;

import creator.ShaobingStore;
import creator.concreteProduct.CSBeefShaobing;
import creator.concreteProduct.CSOnionShaobing;
import product.Shaobing;

/**
 * @program: designModel
 * @description: 长沙烧饼店
 * @author: liuxincheng
 * @create: 2019-04-01 14:22
 */
public class CSShaobingStore extends ShaobingStore {

    private Shaobing shaobing = null;
    @Override
    public Shaobing createShaobing(String type) {
        switch (type){
            case "onion":
                shaobing = new CSOnionShaobing();
                break;
            case "beef":
                shaobing = new CSBeefShaobing();
                break;
                default:
                    break;
        }
        return shaobing;
    }
}