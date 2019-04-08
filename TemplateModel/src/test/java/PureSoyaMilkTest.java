import abstr.SoyaMilkWithHook;
import abstr.impl.PureSoyaMilk;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 模板模式-钩子方法测试
 * @author: liuxincheng
 * @create: 2019-04-03 13:55
 */
public class PureSoyaMilkTest {

    @Test
    public void test1() {
        //制作纯豆浆
//        System.out.println( );
        System.out.println("-----制作纯豆浆步骤-------");
        SoyaMilkWithHook pureSoyaMilk = new PureSoyaMilk( );
        pureSoyaMilk.prepareRecipe( );
    }
}