package inter;

import java.util.List;

/**
 * @ClassName LambdaTest
 * @Description: TODO
 * @Author lxc
 * @Date 2020/2/7
 * @Version V1.0
 **/
public interface LambdaTest<T> {

    public T[] getArray(ListToArray<T> listToArray,List<T> list);
}
