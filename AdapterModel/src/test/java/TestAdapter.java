import adapter.GooseAdapter;
import inter.Bird;
import inter.impl.Goose;
import inter.impl.Parrot;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 适配器模式测试
 * @author: liuxincheng
 * @create: 2019-04-02 13:49
 */
public class TestAdapter {

    @Test
    public void testAdapter() {
        System.out.printf("%s\n","-----鹦鹉会叫也会飞-----");
        Bird parrot = new Parrot( );
        parrot.chirp( );
        parrot.fly( );

        System.out.printf("%s\n","-----鹅会叫但不会飞-----");
        Goose goose = new Goose( );
        Bird gooseAdapter = new GooseAdapter(goose);
        gooseAdapter.chirp( );
        gooseAdapter.fly( );
    }
}