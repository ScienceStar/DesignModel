package bean.impl;

import bean.Victorer;
import inter.impl.Victorying;

/**
 * @ClassName Victorer
 * @Description: TODO 服务员
 * @Author lxc
 * @Date 2020/4/8 11:45
 * @Version V1.0
 **/
public class VictorOr extends Victorer {

    public VictorOr(){
        doWorking = new Victorying();
    }
}
