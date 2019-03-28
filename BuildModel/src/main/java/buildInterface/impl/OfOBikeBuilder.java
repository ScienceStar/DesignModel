package buildInterface.impl;

import bean.Bike;
import buildInterface.BikeBuilder;

/**
 * @program: designModel
 * @description: OFO单车生产线
 * @author: liuxincheng
 * @create: 2019-03-28 09:36
 */
public class OfOBikeBuilder implements BikeBuilder {

    private Bike bike = new Bike();
    @Override
    public void buildType() {
        bike.setType("黑色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("黄色车架");
    }

    @Override
    public void buildGps() {
        bike.setGps("ofo定制版GPS");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}