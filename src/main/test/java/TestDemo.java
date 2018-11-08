import com.bright.dao.IUserDao;
import com.bright.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestDemo {
    @Autowired
    private IUserDao iUserDao;
    @Test
    public void test(){
        User user = iUserDao.selectUser(1);
        System.out.println(user.getUsername());
    }
}
