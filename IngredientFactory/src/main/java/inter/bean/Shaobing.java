package inter.bean;

/**
 * @program: designModel
 * @description: 抽象烧饼
 * @author: liuxincheng
 * @create: 2019-04-02 09:13
 */
public abstract class Shaobing {
    //烧饼名称
    public String name;
    //烧饼用的配料
    public Sauce sauce;
    //面团
    public Dough dough;
    //蔬菜
    public Vegetable vegetable;

    //该方法在子类实现，创建所需的原材料
    public abstract void prepare();

    //烤烧饼
    public void bake(){
        System.out.println("Bake for 25 minutes at 350C");
    }

    //切面团
    public void cut(){
        System.out.println("Cutting the dough into fit slices");
    }

    //打包
    public void box(){
        System.out.println("Place shaobing into official box");
    }
}