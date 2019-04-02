package inter.impl.bean;

import inter.bean.Vegetable;

/**
 * @program: designModel
 * @description: 洋葱
 * @author: liuxincheng
 * @create: 2019-04-02 09:07
 */
public class Onion implements Vegetable {

    public Onion() {
        System.out.println("创建"+this.getName() );
    }

    @Override
    public String getName() {
        return "洋葱";
    }
}