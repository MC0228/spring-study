import com.shisan.config.UserConfig;
import com.shisan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:shisan
 * @Date:2023/10/24 15:33
 */
public class myTest {
    @Test
    public void test() {
        // 使用config完全取代了xml的方式，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }
}
