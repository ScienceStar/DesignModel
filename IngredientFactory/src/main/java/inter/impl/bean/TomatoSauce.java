package inter.impl.bean;

import inter.bean.Sauce;

/**
 * @program: designModel
 * @description: 番茄酱
 * @author: liuxincheng
 * @create: 2019-04-02 09:04
 */
public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        System.out.println("创建"+this.getName() );
    }

    @Override
    public String getName() {
        return "番茄酱";
    }
}