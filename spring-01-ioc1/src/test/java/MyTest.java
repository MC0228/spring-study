import com.shisan.dao.UserDaoImpl;
import com.shisan.dao.UserDaoMysqlImpl;
import com.shisan.dao.UserDaoOracleImpl;
import com.shisan.service.UserService;
import com.shisan.service.UserServiceImpl;

/**
 * @Author:shisan
 * @Date:2023/10/18 20:24
 */
public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的就是业务层，dao层他们不需要接触！！
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
