package observe.impl;

import observe.Observer;

/**
 * @program: designModel
 * @description: 短信观察者
 * @author: liuxincheng
 * @create: 2019-03-28 14:39
 */
public class SmsObserver implements Observer {
    @Override
    public void update(double money) {
        System.out.println("短信资金发生变动:"+(money+0.03*4));
    }
}