package composite.impl;

import composite.Component;

import java.util.ArrayList;

/**
 * @ClassName Composite
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 12:57
 * @Version V1.0
 **/
public class Composite implements Component{
    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        for (Object obj:children){
            ((Component)obj).operation();
        }
    }
}
