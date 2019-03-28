package Subject;


import observe.Observer;

/***
 * @Title: Administrator
 * @ClassName Subject
 * @Description: TODO 主题接口
 * @author lxc
 * @date 2019/3/28 13:51
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
