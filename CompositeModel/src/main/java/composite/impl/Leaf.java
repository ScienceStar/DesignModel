package composite.impl;

import composite.Component;

/**
 * @ClassName Leaf
 * @Description: TODO 叶子
 * @Author lxc
 * @Date 2020/3/21 12:54
 * @Version V1.0
 **/
public class Leaf implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+":被访问！");
    }
}
