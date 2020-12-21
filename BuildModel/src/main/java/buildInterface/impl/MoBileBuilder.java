package buildInterface.impl;

import bean.Bike;
import buildInterface.BikeBuilder;

/**
 * @program: designModel.uml
 * @description: 摩拜生产线
 * @author: liuxincheng
 * @create: 2019-03-28 09:32
 */
public class MoBileBuilder implements BikeBuilder {

    private final Bike bike = new Bike();
    @Override
    public void buildType() {
        bike.setType("橙色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("橙色车架");
    }

    @Override
    public void buildGps() {
        bike.setGps("摩拜定制版GPS");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}