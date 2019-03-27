import bean.Singleton;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 单例实例测试
 * @author: liuxincheng
 * @create: 2019-03-27 09:03
 */
public class SingletonTest {

    @Test
    public void test1(){
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        singleton.show();
        singleton1.show();
    }
}