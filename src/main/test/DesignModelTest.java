import buildInterface.SendFactory;
import buildInterface.SendSmsFactory;
import inter.Provider;
import inter.Sender;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 设计模式测试
 * @author: liuxincheng
 * @create: 2019-03-26 09:36
 */
public class DesignModelTest {

    @Test
    public void designTest(){
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.proce("mailaaa");
        sender.send();
    }

    @Test
    public void designTest2(){
        Provider provider = new SendSmsFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}