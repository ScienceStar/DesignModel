package impl;

import inter.Sender;

/**
 * @program: designModel
 * @description: 短信发送
 * @author: liuxincheng
 * @create: 2019-03-26 09:26
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("我是短信发送装置.......................!" );
    }
}