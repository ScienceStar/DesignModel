package Subject;

/**
 * @program: designModel
 * @description: 抽象主题
 * @author: liuxincheng
 * @create: 2019-03-28 14:19
 */
public abstract class AbstractSubject implements Subject{
    //可以在这里新增Subject没有的方法，以便子类共用
    public abstract void changeAccount(double money);
}