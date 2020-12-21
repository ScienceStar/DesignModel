import impl.LambdaImpl;
import inter.LambdaTest;
import inter.ListToArray;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestLambda
 * @Description: TODO
 * @Author lxc
 * @Date 2020/2/7
 * @Version V1.0
 **/
public class TestLambda {

    @Test
    public void testList2Array(){
        List<String> stringList = new ArrayList<String>();
        stringList.add(0,"jack");
        stringList.add(1,"tom");
        stringList.add(2,"mick");


        LambdaTest<String> lambdaTest = new LambdaImpl<String>();

        Object[] strings = lambdaTest.getArray(ListToArray::list2array2,stringList);

        System.out.println(strings[2]);
    }
}
