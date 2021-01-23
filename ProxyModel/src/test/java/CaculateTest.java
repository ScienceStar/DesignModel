import inter.IAnazy;
import inter.ICaculate;
import inter.impl.AnazyImpl;
import inter.impl.CaculateImpl;
import inter.impl.LogInterceptor;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.*;

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

    @Test
    public void foreachList(){
        List<String> names = Arrays.asList("tom","mike","peter");
        int num = add(3, 8);
        List<String> stringList = Arrays.asList("a", "b", "c");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public int add(int a,int b){
        return a+b;
    }

    @Test
    public void testAnazy(){
        IAnazy anazy = new AnazyImpl();
        int result = anazy.add(3, 8);
        System.out.println(result);
        HashMap<Object, Object> hashMap = new HashMap<>();
        List<String> stringList = new ArrayList<String>();
        Set<String> stringSet = new HashSet<String>();
        int num = this.add(3, 8);
        System.out.println(num);
    }
}
