import composite.Component;
import composite.impl.Composite;
import composite.impl.Leaf;

/**
 * @ClassName CompositePattern
 * @Description: TODO 组合模式测试
 * @Author lxc
 * @Date 2020/3/21 13:05
 * @Version V1.0
 **/
public class CompositePattern {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
