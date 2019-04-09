package bean.impl;

import bean.Auditer;
import inter.impl.Auditing;

/**
 * @program: designModel
 * @description: 审计者
 * @author: liuxincheng
 * @create: 2019-04-09 09:39
 */
public class AuditOr extends Auditer {

    public AuditOr(){
        doWorking = new Auditing();
    }
}