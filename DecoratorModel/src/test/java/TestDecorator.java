import component.Tea;
import component.impl.MilkTea;
import decorator.Coffe;
import decorator.Pearl;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 装饰器模式测试
 * @author: liuxincheng
 * @create: 2019-04-01 10:16
 */
public class TestDecorator {

    @Test
    public void testDecorator() {
        //创建一杯纯奶茶,不需要加调料，打印出描述和价格
        Tea tea = new MilkTea( );
        System.out.println(tea.getDescrption( ) + " 价格为：￥" + tea.getTeaCost( ));

        //创建加调料的奶茶
        Tea tea2 = new MilkTea( );
        //加上一份珍珠
        tea2 = new Pearl(tea2);
        //再加一份珍珠
        tea2 = new Pearl(tea2);
        //加上一份咖啡调料
        tea2 = new Coffe(tea2);

        tea2 = new Pearl(tea2);

        //打印加了调料的奶茶
        System.out.println(tea2.getDescrption( ) + " 价格为：￥" + tea2.getTeaCost( ));
    }
}