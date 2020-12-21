package inter.impl;

import inter.MyRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @program: designModel
 * @description: 代理对象处理类
 * @author: liuxincheng
 * @create: 2019-04-02 14:37
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String request(int money) {
        System.out.println("充值" + money + "元话费成功");
        return "充值话费:"+money+"元话费成功!";
    }

    public static void main(String[] args) {
        try {
            // 产生远程对象
            MyRemote service = new MyRemoteImpl();

            // 注册远程访问接口
            LocateRegistry.createRegistry(8888);

            // 注册远程对象，注册名为RemoteHello，代理访问时指定这个名称就可以找到本类
            Naming.rebind("rmi://localhost:8888/RemoteHello",service);
            System.out.println("远程对象创建成功.......................");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}