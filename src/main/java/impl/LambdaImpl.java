package impl;

import inter.LambdaTest;
import inter.ListToArray;

import java.util.List;

/**
 * @ClassName LambdaImpl
 * @Description: TODO
 * @Author lxc
 * @Date 2020/2/7
 * @Version V1.0
 **/
public class LambdaImpl<T> implements LambdaTest {

    @Override
    public Object[] getArray(ListToArray listToArray, List list) {
        return listToArray.list2array(list);
    }
}
