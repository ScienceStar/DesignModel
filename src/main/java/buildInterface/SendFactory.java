package buildInterface;

import impl.MailSender;
import impl.SmsSender;
import inter.Sender;

/**
 * @program: designModel
 * @description: 发送工厂类
 * @author: liuxincheng
 * @create: 2019-03-26 09:29
 */
public class SendFactory {

    public Sender proce(String type){
        switch (type){
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
                default:
                    System.out.println("请输入正确类型...." );
                    return new Sender( ) {
                        @Override
                        public void send() {
                            System.out.println("空发送装置.............." );
                        }
                    };
        }
    }
}