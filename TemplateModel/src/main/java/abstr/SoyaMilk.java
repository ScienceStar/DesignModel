package abstr;

/**
 * @program: designModel
 * @description: 豆浆抽象类
 * @author: liuxincheng
 * @create: 2019-04-03 10:49
 */
public abstract class SoyaMilk {
    //这是模板方法，用final修饰，不允许子类覆盖。模板方法定义了制作豆浆的程序
    public void prepareRecipe() {
        selectMaterial( );
        addCondiments( );
        soak( );
        beat( );
    }

    //选材方法，选择黄豆
    void selectMaterial() {
        System.out.println("第一步、选择好了新鲜黄豆");
    }

    //可以添加不同的配料，在这里设置为抽象方法，子类必须实现
    public abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("第三步、黄豆和配料开始浸泡，大概需要5个小时");
    }

    //放到豆浆机打碎
    void beat() {
        System.out.println("第四步、黄豆的配料放到豆浆机打碎");
    }
}