package composite.impl;

import composite.OrganizationComponent;

/**
 * @program: designModel
 * @description: 输出对象
 * @author: liuxincheng
 * @create: 2019-04-08 09:52
 */
public class OutputInfo {

    OrganizationComponent allOrganization;

    public OutputInfo(OrganizationComponent allOrganization) {
        this.allOrganization = allOrganization;
    }

    public void printOrganization(){
        allOrganization.print();
    }
}