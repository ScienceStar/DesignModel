package bean;

/**
 * @program: designModel
 * @description: 单例实例-基于内部类实现
 * @author: liuxincheng
 * @create: 2019-03-27 10:30
 */
public class SingletonBean {

    private static SingletonBean singletonBean = null;

    private SingletonBean() {
    }

    /***  
     * @Title: Administrator
     * @ClassName SingletonBean
     * @Description: TODO 使用内部类来维护使用单例
     * @author lxc
     * @date 2019/3/27 10:34
     */
    public static class SingletonClassFactory{
        private static SingletonBean singletonBean = new SingletonBean();
    }
    
    /***
     *@Description: 获取单例
     *@Param: []
     *@return: bean.SingletonBean
     *@Author: lxc
     *@date: 2019/3/27 10:35
     */
    public static SingletonBean getInstance(){
        return SingletonClassFactory.singletonBean;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

    public void show(){
        System.out.println("基于内部类来实现单例.................");
    }
}