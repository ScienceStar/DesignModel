import domin.User;
import org.junit.Test;

public class Lambda2<U extends User> {
    public User user;

    public U u;

    @Test
    public void show(){
        user = new domin.User();
        user.setUserId("1");
        user.setUserName("jack");
        u = (U) new User();
        u.setUserName("Tom");
        u.setUserId("222");
        System.out.println(user.getUserId()+"--"+user.getUserName());
        System.out.println(u.getUserId()+"--"+u.getUserName());
    }
}
