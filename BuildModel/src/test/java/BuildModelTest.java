import bean.Bike;
import buildInterface.BikeBuilder;
import buildInterface.impl.MoBileBuilder;
import buildInterface.impl.OfOBikeBuilder;
import enginer.EngineeringDepartment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: designModel.uml
 * @description: 建造者模式测试
 * @author: liuxincheng
 * @create: 2019-03-28 09:43
 */
public class BuildModelTest {

    @Test
    public void buildModelDemo(){
        //摩拜生产
        BikeBuilder moBileBuilder = new MoBileBuilder();
        EngineeringDepartment mobikeDepartment = new EngineeringDepartment(moBileBuilder);
        //生产车子
        mobikeDepartment.construct();
        Bike moBike = moBileBuilder.getBike();


        //ofo生产线
        BikeBuilder ofoBikeBuilder = new OfOBikeBuilder();
        EngineeringDepartment ofoDepartment = new EngineeringDepartment(ofoBikeBuilder);
        //生产车子
        ofoDepartment.construct();
        Bike ofo = ofoBikeBuilder.getBike();

        List<Bike> bikeList = new LinkedList<>();
        bikeList.add(moBike);
        bikeList.add(ofo);

        for(Bike bike1 : bikeList){
            System.out.println(bike1.getType()+"---->"+bike1.getGps());
        }
    }
}