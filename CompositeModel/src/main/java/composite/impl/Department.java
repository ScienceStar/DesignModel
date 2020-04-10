package composite.impl;

import composite.OrganizationComponent;

/**
 * @program: designModel
 * @description: 专业(系)对象
 * @author: liuxincheng
 * @create: 2019-04-08 09:50
 */
public class Department extends OrganizationComponent {

    String name;
    String description;

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // 重写机构组件的方法，其作为叶子没有增加和删除方法
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /* 叶子只需要输出自己的信息 */
    @Override
    public void print() {
        System.out.println(getName() + "-----------------------" + this.getDescription());
    }
}