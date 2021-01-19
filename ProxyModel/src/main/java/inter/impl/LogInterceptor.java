package inter.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName LogInterceptor
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/19 15:00
 * @Version V1.0
 **/
public class LogInterceptor implements InvocationHandler {
    private Object target;

    public LogInterceptor(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    private void before(){
        System.out.println("printf before");
    }

    private void after(){
        System.out.println("printf after");
    }
}
