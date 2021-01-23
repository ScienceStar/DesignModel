import com.bean.DemoClass;
import com.config.DemoConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName DemoConfig
 * @Description: TODO
 * @Author lxc
 * @Date 2021/1/23 15:16
 * @Version V1.0
 **/
public class DemoConfig {

    @Test
    public void testConfig(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(DemoConfiguration.class);
        DemoClass bean = ac.getBean(DemoClass.class);
        bean.say();
    }
}
