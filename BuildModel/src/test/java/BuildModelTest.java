import bean.Bike;
import buildInterface.BikeBuilder;
import buildInterface.impl.MoBileBuilder;
import buildInterface.impl.OfOBikeBuilder;
import enginer.EngineeringDepartment;
import org.junit.Test;

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
        BikeBuilder bikeBuilder = new MoBileBuilder();
        EngineeringDepartment engineeringDepartment = new EngineeringDepartment(bikeBuilder);
        //生产车子
        engineeringDepartment.construct();
        Bike bike = bikeBuilder.getBike();


        //ofo生产线
        BikeBuilder ofoBikeBuilder = new OfOBikeBuilder();
        EngineeringDepartment ofoDepartment = new EngineeringDepartment(ofoBikeBuilder);
        //生产车子
        ofoDepartment.construct();
        Bike ofo = ofoBikeBuilder.getBike();

        System.out.println(bike.getType()+"\t"+bike.getGps()+"\n"+ofo.getType()+"\t"+ofo.getGps());
    }
}