package observe.impl;

import observe.Observer;

/**
 * @program: designModel
 * @description: 邮件观察者
 * @author: liuxincheng
 * @create: 2019-03-28 14:37
 */
public class MailObserver implements Observer {
    @Override
    public void update(double money) {
        System.out.println("邮件账户资金发生变动:"+money*0.8 );
    }
}