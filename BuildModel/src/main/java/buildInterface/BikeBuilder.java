package buildInterface;

import bean.Bike;

public interface BikeBuilder {

    void buildType();

    void buildFrame();

    void buildGps();

    Bike getBike();
}
