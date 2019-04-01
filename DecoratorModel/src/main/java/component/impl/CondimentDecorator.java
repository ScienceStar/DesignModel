package component.impl;

import component.Tea;

/**
 * @program: designModel
 * @description: 抽象配料
 * @author: liuxincheng
 * @create: 2019-04-01 10:02
 */
public abstract class CondimentDecorator extends Tea {

    //所有组件必须要返回的
    public abstract String getDescrption();
}