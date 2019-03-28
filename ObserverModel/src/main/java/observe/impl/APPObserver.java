package observe.impl;

import observe.Observer;

/**
 * @program: designModel
 * @description: 客户端观察者
 * @author: liuxincheng
 * @create: 2019-03-28 14:32
 */
public class APPObserver implements Observer {

    @Override
    public void update(double money) {
        //发送app客户端通知账号资金变动
        System.out.println("app客户端提醒：您的账户资金变动:" + money);
    }
}