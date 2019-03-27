import bean.Singleton;
import bean.SingletonBean;
import org.junit.Test;

import java.io.PrintStream;

/**
 * @program: designModel
 * @description: 单例实例测试
 * @author: liuxincheng
 * @create: 2019-03-27 09:03
 */
public class SingletonTest {

    private PrintStream printStream = System.out;
    @Test
    public void test1(){
        Singleton si = Singleton.getInstance();
        si.show();
        printStream.println("hello");
    }

    @Test
    public void test2(){
        SingletonBean singletonBean = SingletonBean.getInstance();
        singletonBean.show();
        singletonBean.updateProperties();
    }
}