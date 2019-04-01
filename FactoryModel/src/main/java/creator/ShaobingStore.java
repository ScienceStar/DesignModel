package creator;

import product.Shaobing;

/**
 * @program: designModel
 * @description: 烧饼店
 * @author: liuxincheng
 * @create: 2019-04-01 14:06
 */
public abstract class ShaobingStore {

    public Shaobing orderShaobing(String type) {
        Shaobing shaobing = createShaobing(type);

        shaobing.prepare( );
        shaobing.cut( );
        shaobing.bake( );
        shaobing.box( );

        return shaobing;
    }

    //未实现的工厂方法
    public abstract Shaobing createShaobing(String type);
}