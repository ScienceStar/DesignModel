package inter.impl;

import inter.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/***
 * @Title: Administrator
 * @ClassName Proxy
 * @Description: TODO 代理对象
 * @author lxc
 * @date 2019/4/2 14:41
 */
public class Proxy implements MyRemote {

    @Override
    public String request(int money) throws RemoteException, MalformedURLException, NotBoundException {
        MyRemote remote = (MyRemote) Naming.lookup("rmi://localhost:8888/RemoteHello");
        return remote.request(money);
    }
}
