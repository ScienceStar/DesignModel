package inter.impl;

import inter.DoWorking;

/**
 * @program: designModel
 * @description: 审计
 * @author: liuxincheng
 * @create: 2019-04-09 09:18
 */
public class Auditing implements DoWorking {
    @Override
    public void comeOn() {
        System.out.println("正在审计................." );
    }

    @Override
    public void doSth() {

    }
}