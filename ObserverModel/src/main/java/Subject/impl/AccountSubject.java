package Subject.impl;

import Subject.AbstractSubject;

import java.util.ArrayList;
import java.util.List;

import observe.Observer;

/**
 * @program: designModel
 * @description: 银行主题
 * @author: liuxincheng
 * @create: 2019-03-28 14:41
 */
public class AccountSubject extends AbstractSubject {

    //观察者集合
    public List<Observer> observerList;

    //账户资金
    private Double money;

    public AccountSubject() {
        this.observerList = new ArrayList<>( );
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    //删除观察者
    @Override
    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if (i > 0) {
            observerList.remove(i);
        }
    }

    //账号资金变动时通知观察者
    @Override
    public void notifyObservers() {
        if (observerList.size( ) > 0) {
            for (Observer observer : observerList) {
                observer.update(money);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace( );
                }
            }
        }
    }

    //账户改变
    @Override
    public void changeAccount(double money) {
        System.out.println("账户资金变动：" + money);
        this.money = money;

        //通知观察者
        notifyObservers( );
    }
}