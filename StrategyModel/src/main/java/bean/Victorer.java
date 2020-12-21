package bean;

import inter.DoWorking;

import java.util.Random;

/**
 * @ClassName Victorer
 * @Description: TODO 服务员
 * @Author lxc
 * @Date 2020/4/8 11:39
 * @Version V1.0
 **/
public abstract class Victorer {
    public DoWorking doWorking;

    public void service() {
        Random random = new Random();
        if (random.nextInt(20) % 2 == 0) {
            doWorking.doSth();
        } else {
            doWorking.comeOn();
        }

    }
}
