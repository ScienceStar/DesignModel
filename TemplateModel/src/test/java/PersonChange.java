import action.ChangeAction;
import bean.Person;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: designModel
 * @description: 人员改变测试类
 * @author: liuxincheng
 * @create: 2019-04-09 11:19
 */
public class PersonChange {


    @Test
    public void testChangePerson() {
        Person person = null;
        List<Person> personList = new LinkedList<Person>( );

        for (int i = 0; i < 10; i++) {
            person = new Person( );
            person.setName("mike" + i);
            person.setAge(String.valueOf(i++));
            person.setHight(132.43 + i);
            personList.add(person);
        }

        for (Person person1 : personList) {
           // ChangeAction.changePerson(person1);
            System.out.println(person1.getName( ) + "\t" + person1.getAge( ) + "\t" + person1.getHight( ));
        }
    }
}