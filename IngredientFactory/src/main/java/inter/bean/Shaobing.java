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
        System.out.println("开始烘烤................");
    }

    //切面团
    public void cut(){
        System.out.println("开始切面团...............");
    }

    //打包
    public void box(){
        System.out.println("打包.....................");
    }
}