package client;

import inter.MyRemote;
import inter.impl.Proxy;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @program: designModel
 * @description: 代理对象客户端
 * @author: liuxincheng
 * @create: 2019-04-02 14:44
 */
public class ProxyClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        MyRemote proxy = new Proxy();
        System.out.println(proxy.request(100));
    }
}