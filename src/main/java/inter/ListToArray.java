package inter;

import java.util.List;

/**
 * @InterfaceName ListToArray
 * @Description: TODO
 * @Author lxc
 * @Date 2020/2/7
 * @Version V1.0
 **/
@FunctionalInterface
public interface ListToArray<T> {

    public  Object[] list2array(List<T> list);

    public static Object[] list2array2(List list){
        return list.toArray();
    }
}
