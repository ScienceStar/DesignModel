package component;

/**
 * @program: designModel
 * @description: 茶组件
 * @author: liuxincheng
 * @create: 2019-04-01 09:57
 */
public abstract class Tea {

    //描述
    public String descrption="unknow tea";

    //返回其价格
    public abstract double getTeaCost();

    //返回描述
    public String getDescrption() {
        return descrption;
    }
/*
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }*/
}