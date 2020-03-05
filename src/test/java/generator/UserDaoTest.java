package generator;

import com.passer.nightmarket.NightMarketApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = NightMarketApplication.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testUserDao() {
        User user = new User();
        user.setRealName("周");
        user.setPhoneNumber("17691215797");
        user.setAddress("北京市海淀区");
        user.setIsAdmin(false);
        user.setPassword("147369");
        user.setNickname("passer");
        userDao.insert(user);
        System.out.println(user.getUserId());
    }

}