import inter.story.ShaobingStore;
import inter.story.impl.GZShaobingStore;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 抽象工厂测试
 * @author: liuxincheng
 * @create: 2019-04-02 09:24
 */
public class TestIngredientFactory {

    @Test
    public void test1() {
        //在广州开一个烧饼店
        ShaobingStore gzStore = new GZShaobingStore( );
        //售出一个洋葱烧饼
        gzStore.orderShaobing("onion");
    }
}