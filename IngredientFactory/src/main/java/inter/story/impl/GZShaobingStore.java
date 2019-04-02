package inter.story.impl;

import inter.bean.Shaobing;
import inter.impl.bean.OnionShaobing;
import inter.story.ShaobingStore;

/**
 * @program: designModel
 * @description: 广州烧饼店
 * @author: liuxincheng
 * @create: 2019-04-02 09:23
 */
public class GZShaobingStore extends ShaobingStore {


    @Override
    public Shaobing createShaobing(String type) {
        Shaobing shaobing = null;
        if("onion".equals(type)){
            shaobing = new OnionShaobing();
        }

        return shaobing;
    }
}