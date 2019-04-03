import abstr.SoyaMilk;
import abstr.impl.NutSoyaMilk;
import abstr.impl.ReddatesSoyaMilk;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 模板模式测试
 * @author: liuxincheng
 * @create: 2019-04-03 10:54
 */
public class TestTemplate {

    @Test
    public void test1() {
        //制作红枣豆浆
        System.out.println( );
        System.out.println("-----制作红枣豆浆步骤-------");
        SoyaMilk reddatesSoyaMilk = new ReddatesSoyaMilk( );
        reddatesSoyaMilk.prepareRecipe( );

        //制作核桃豆浆
        System.out.println( );
        System.out.println("-----制作核桃豆浆步骤-------");
        SoyaMilk nutSoyaMilk = new NutSoyaMilk( );
        nutSoyaMilk.prepareRecipe( );
    }
}