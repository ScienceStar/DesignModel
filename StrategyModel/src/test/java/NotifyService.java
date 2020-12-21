import bean.enm.NotifyType;

/**
 * @ClassName NotifyService
 * @Description: TODO
 * @Author lxc
 * @Date 2020/12/21 11:17
 * @Version V1.0
 **/
public class NotifyService {
    public void doNotify(String type) {
        NotifyType.valueOf(type).notifyMechanism().doNotify("放假了。。。。");
    }

    public static void main(String[] args){
        NotifyService notifyService = new NotifyService();
        notifyService.doNotify("EMAIL");
        notifyService.doNotify("SMS");
        notifyService.doNotify("WECHAT");
        System.out.println(NotifyType.valueOf("EMAIL"));
    }
}
