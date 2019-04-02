package inter.impl.bean;

import inter.bean.Dough;

/**
 * @program: designModel
 * @description: 东北面粉
 * @author: liuxincheng
 * @create: 2019-04-02 08:59
 */
public class DBDough implements Dough {

    public DBDough() {
        System.out.println("创建"+this.getName() );
    }

    @Override
    public String getName() {
        return "东北面粉";
    }
}