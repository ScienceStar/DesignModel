package product;

/**
 * @program: designModel
 * @description: 烧饼
 * @author: liuxincheng
 * @create: 2019-04-01 14:07
 */
public abstract class Shaobing {

    //烧饼名称
    public String name;
    //配料
    public String sauce;
    //面团
    public String dough;

    public void prepare(){
        System.out.println("Prepareing " + name);
        //和面
        System.out.println("Kneading dough...");
        //加配料
        System.out.println("加配料：" + sauce);
    }

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