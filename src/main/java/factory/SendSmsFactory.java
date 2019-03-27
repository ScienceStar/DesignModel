package factory;

import impl.SmsSender;
import inter.Provider;
import inter.Sender;

/**
 * @program: designModel
 * @description: 短信发送工厂
 * @author: liuxincheng
 * @create: 2019-03-26 15:20
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}