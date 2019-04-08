package abstr;

/**
 * @program: designModel
 * @description: 钩子方法
 * @author: liuxincheng
 * @create: 2019-04-03 13:44
 */
public abstract class SoyaMilkWithHook {

    //这是模板方法，用final修饰，不允许子类覆盖。模板方法定义了制作豆浆的程序
    public final void prepareRecipe() {
        selectMaterial( );
        //判断是否添加配料
        if (customerWantsCondiments( )) {
            addCondiments( );
        }
        soak( );
        beat( );
    }

    //选材方法，选择黄豆
    public void selectMaterial() {
        System.out.println("选择好了新鲜黄豆");
    }

    //可以添加不同的配料，在这里设置为抽象方法，子类必须实现
    protected abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("材料开始浸泡，大概需要5个小时");
    }

    //放到豆浆机打碎
    void beat() {
        System.out.println("材料放到豆浆机打碎");
    }

    //钩子方法
    public boolean customerWantsCondiments(){
        return true;
    }
}