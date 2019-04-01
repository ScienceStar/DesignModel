import creator.ShaobingStore;
import creator.concreteCreator.CSShaobingStore;
import creator.concreteCreator.GZShaobingStore;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 工厂模式测试
 * @author: liuxincheng
 * @create: 2019-04-01 14:26
 */
public class TestFactory {

    @Test
    public void testFactory() {
        //在广州开一个烧饼店
        ShaobingStore gzStore = new GZShaobingStore( );
        //售出一个洋葱烧饼
        gzStore.orderShaobing("onion");
        System.out.println("----------------------");
        //在长沙开一个烧饼店
        ShaobingStore csStore = new CSShaobingStore( );
        //售出一个洋葱烧饼
        csStore.orderShaobing("onion");
    }
}