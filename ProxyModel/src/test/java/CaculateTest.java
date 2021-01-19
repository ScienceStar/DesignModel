import inter.ICaculate;
import inter.impl.CaculateImpl;
import inter.impl.LogInterceptor;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName CaculateTest
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/19 14:39
 * @Version V1.0
 **/
public class CaculateTest {
    public static void main(String[] args) {
        CaculateImpl caculate = new CaculateImpl();
        ClassLoader classLoader = caculate.getClass().getClassLoader();
        Class[] interfaces = caculate.getClass().getInterfaces();
        InvocationHandler logHandler = new LogInterceptor(caculate);
        CaculateImpl cal = (CaculateImpl) Proxy.newProxyInstance(classLoader,interfaces,logHandler);
        int num1=cal.add(3,5);
        int num2=cal.mul(8,2);
        System.out.println(num1+"   "+num2);
    }

    /**
     * @MethodName: testCaculate
     * @Description: TODO 基于代理创建对象
     * @Param []
     * @Return void
     * @Throws
     * @Author lxc
     * @Date 2021/1/19 15:18
     */
    @Test
    public void testCaculate(){
        CaculateImpl caculate = new CaculateImpl();
        ClassLoader classLoader = caculate.getClass().getClassLoader();
        Class[] interfaces = caculate.getClass().getInterfaces();
        InvocationHandler logHandler = new LogInterceptor(caculate);
        ICaculate cal = (ICaculate) Proxy.newProxyInstance(classLoader,interfaces,logHandler);
        int num1=cal.add(3,5);
        int num2=cal.mul(8,2);
        System.out.println(num1+"   "+num2);
    }
}
