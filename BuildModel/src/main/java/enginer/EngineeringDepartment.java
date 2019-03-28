package enginer;

import buildInterface.BikeBuilder;

/**
 * @program: designModel
 * @description: 摩拜工程部
 * @author: liuxincheng
 * @create: 2019-03-28 09:39
 */
public class EngineeringDepartment {

    private BikeBuilder bikeBuilder;

    public EngineeringDepartment(BikeBuilder bikeBuilder) {
        this.bikeBuilder = bikeBuilder;
    }

    public void construct(){
        bikeBuilder.buildType();
        bikeBuilder.buildFrame();
        bikeBuilder.buildGps();
    }
}