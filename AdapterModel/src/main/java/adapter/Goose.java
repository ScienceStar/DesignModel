package adapter;

import inter.Bird;

/**
 * @program: designModel
 * @description: 鹅类
 * @author: liuxincheng
 * @create: 2019-04-02 13:44
 */
public class Goose implements Bird {

    @Override
    public void chirp(){
        System.out.println("鹅鹅鹅...........");
    }

    @Override
    public void fly(){
        System.out.println("Soory! I can't fly............." );
    }
}
