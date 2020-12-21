import bean.Auditer;
import bean.Employee;
import bean.Recruter;
import bean.Victorer;
import bean.enm.Method;
import bean.impl.AuditOr;
import bean.impl.Coder;
import bean.impl.RecrutOr;
import bean.impl.VictorOr;
import inter.ICaculate;
import inter.impl.CaculateImpl;
import org.junit.Test;

/**
 * @program: designModel
 * @description: 策略客户端
 * @author: liuxincheng
 * @create: 2019-04-09 09:34
 */
public class StrategyClient {

    @Test
    public void test1(){
        Employee coder = new Coder();
        coder.startWork();
    }

    @Test
    public void test2(){
        Auditer auditer = new AuditOr();
        auditer.audit();
    }


    @Test
    public void test3(){
        Recruter recruter = new RecrutOr();
        recruter.recruting();
    }

    @Test
    public void victor(){
        Victorer victorer = new VictorOr();
        victorer.service();
    }

    @Test
    public void testCal(){
        ICaculate<Integer> caculate = new CaculateImpl<Integer>();
        ICaculate<String> caculate2 = new CaculateImpl<String>();
        System.out.println(caculate.getResult(3,8));
        System.out.println(caculate2.getResult("welcome","china"));
    }

    @Test
    public void testConvert(){
        int a=3,b=4;
        a+=b;
        b=a-b;
        a-=b;
        System.out.println(a+"    "+b);
    }

    @Test
    public void testEmum(){
        String parm1= Method.Get.getValue();
        System.out.println(parm1);
    }
}
