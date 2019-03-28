import Subject.impl.AccountSubject;
import observe.Observer;
import observe.impl.APPObserver;
import observe.impl.MailObserver;
import observe.impl.SmsObserver;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 观察者模式测试
 * @author: liuxincheng
 * @create: 2019-03-28 14:53
 */
public class TestObserve {

    @Test
    public void testChangeAccount(){
        //创建账号主题
        AccountSubject subject = new AccountSubject();

        //创建观察者
        Observer appObserver = new APPObserver();
        Observer smsObserver = new SmsObserver();
        Observer mailObserver = new MailObserver();

        //注册观察者到账号主题
        subject.registerObserver(appObserver);
        subject.registerObserver(mailObserver);
        subject.registerObserver(smsObserver);

        subject.changeAccount(7.8);
    }
}