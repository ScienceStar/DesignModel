package buildInterface;

import bean.Bike;

/**
 * @author lxc
 */
public interface BikeBuilder {

    void buildType();

    void buildFrame();

    void buildGps();

    Bike getBike();
}
