import com.shisan.pojo.Student;
import com.shisan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:shisan
 * @Date:2023/10/19 14:37
 */
public class myTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void userTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
//        User user = (User) context.getBean("user");
        User user = context.getBean("user2", User.class); // 显示的声明对象类型，就不用强转
        User user2 = context.getBean("user2", User.class); // 显示的声明对象类型，就不用强转
        System.out.println(user==user2);
        System.out.println(user);

    }
}
