package inter;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/***
 * @Title: Administrator
 * @ClassName MyRemote
 * @Description: TODO 远程代理接口 其继承java的Remote接口，真正干活对象和代理都要实现这个接口
 * @author lxc
 * @date 2019/4/2 14:34
 */
public interface MyRemote extends Remote {

    // 远程调用有风险告诉客户端
    String request(int money) throws RemoteException, MalformedURLException, NotBoundException;
}
