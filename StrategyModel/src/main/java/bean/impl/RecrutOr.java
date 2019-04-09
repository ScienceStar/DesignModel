package bean.impl;

import bean.Recruter;
import inter.impl.Recruiting;

/**
 * @program: designModel
 * @description: 招聘者
 * @author: liuxincheng
 * @create: 2019-04-09 09:51
 */
public class RecrutOr extends Recruter {

    public RecrutOr(){
        doWorking = new Recruiting();
    }
}