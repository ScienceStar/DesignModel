package composite.impl;

import composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designModel
 * @description: 学院对象
 * @author: liuxincheng
 * @create: 2019-04-08 09:49
 */
public class College extends OrganizationComponent {

    String name;
    String description;
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // 重写机构组件的方法，其作为树有增加和删除方法
    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("-------" + getName() + "-----------");
        // 学院下面有很多专业，把他们遍历出来
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}