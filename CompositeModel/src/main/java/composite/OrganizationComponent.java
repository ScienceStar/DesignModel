package composite;

/**
 * @program: designModel
 * @description: 顶级组织
 * @author: liuxincheng
 * @create: 2019-04-08 09:45
 */
public abstract class OrganizationComponent {

    // 每个方法提供默认的实现
    public void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}