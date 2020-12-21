package bean.enm;

import bean.NotifyMechanismInterface;

/**
 * @ClassName NotifyType
 * @Description: TODO
 * @Author lxc
 * @Date 2020/12/21 11:14
 * @Version V1.0
 **/
public enum NotifyType {
    EMAIL("邮件", NotifyMechanismInterface.byEmail()),
    SMS("短信", NotifyMechanismInterface.bySms()),
    WECHAT("微信", NotifyMechanismInterface.byWeChat());

    private String desc;
    private NotifyMechanismInterface notifyMechanism;

    NotifyType(String desc, NotifyMechanismInterface notifyMechanism) {
        this.desc = desc;
        this.notifyMechanism = notifyMechanism;
    }

    public String desc() {
        return desc;
    }
    public NotifyMechanismInterface notifyMechanism() {
        return notifyMechanism;
    }

}
