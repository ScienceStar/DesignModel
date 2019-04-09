package action;

import bean.Person;

/**
 * @program: designModel
 * @description: 人员转换控制类
 * @author: liuxincheng
 * @create: 2019-04-09 11:15
 */
public class ChangeAction {

    public static void changePerson(Person person){
        person.setName("张无忌");
        person.setAge("28");
        person.setHight(171.25);
    }
}