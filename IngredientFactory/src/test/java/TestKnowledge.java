import inter.impl.bean.Person;
import org.junit.Test;

import java.util.Optional;

public class TestKnowledge {

    @Test
    public void testNullAble(){
        Person person = new Person();
        person.setName("tom");
        person.setAge(21);

       Person person1 = Optional.ofNullable(person).get();

        if(Optional.ofNullable(person).isPresent()){
            System.out.println("对象不为空");
        }else {
            System.out.println("不为空");
        }

        System.out.println("------------------");
        Optional.ofNullable(person).ifPresent(p ->{
            System.out.println(p.getAge());
        });
    }
}
