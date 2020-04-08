package bean;

import inter.DoWorking;

/**
 * @ClassName Victorer
 * @Description: TODO 服务员
 * @Author lxc
 * @Date 2020/4/8 11:39
 * @Version V1.0
 **/
public abstract class Victorer {
    public DoWorking doWorking;

    public void service(){
        doWorking.doSth();
    }
}
