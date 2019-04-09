package bean;

import java.io.Serializable;

/**
 * @program: designModel
 * @description: 人员
 * @author: liuxincheng
 * @create: 2019-04-09 11:09
 */
public class Person implements Serializable {

    private String name;

    private String age;

    private Double hight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getHight() {
        return hight;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }
}