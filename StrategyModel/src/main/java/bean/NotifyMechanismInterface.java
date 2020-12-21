package bean;

/**
 * @ClassName NotifyMechanismInterface
 * @Description: TODO
 * @Author lxc
 * @Date 2020/12/21 11:15
 * @Version V1.0
 **/
public interface NotifyMechanismInterface {
    void doNotify(String msg);

    static NotifyMechanismInterface byEmail() {
        return new NotifyMechanismInterface() {
            @Override
            public void doNotify(String msg) {
                // todo 业务逻辑
                System.out.println("通过邮件通知:" + msg);
            }
        };
    }

    /**
     * 使用lambda表达式
     *
     * @return
     */
    static NotifyMechanismInterface bySms() {
        return (msg -> System.out.println("通过短信通知:" + msg));
    }

    static NotifyMechanismInterface byWeChat() {
        return (msg -> System.out.println("通过微信通知:" + msg));
    }
}
