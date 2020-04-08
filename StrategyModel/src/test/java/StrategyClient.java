import bean.Auditer;
import bean.Employee;
import bean.Recruter;
import bean.Victorer;
import bean.impl.AuditOr;
import bean.impl.Coder;
import bean.impl.RecrutOr;
import bean.impl.VictorOr;
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
}