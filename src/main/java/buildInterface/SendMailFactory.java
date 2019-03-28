package buildInterface;

import impl.MailSender;
import inter.Provider;
import inter.Sender;

/**
 * @program: designModel
 * @description: 邮件发送工厂
 * @author: liuxincheng
 * @create: 2019-03-26 15:19
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}