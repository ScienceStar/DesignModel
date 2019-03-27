package impl;

import inter.Sender;

/**
 * @program: designModel
 * @description: 邮件发送
 * @author: liuxincheng
 * @create: 2019-03-26 09:25
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("我是邮件发送装置.................！" );
    }
}