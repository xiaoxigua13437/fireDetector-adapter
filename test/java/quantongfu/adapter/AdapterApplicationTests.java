package quantongfu.adapter;

import com.quantongfu.adapter.dao.UserDao;
import com.quantongfu.adapter.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdapterApplicationTests.class)
public class AdapterApplicationTests {

	@Autowired
	UserDao userDao;

	@Test
	public void contextLoads() {
		User user = userDao.findByUserName("admin");

		System.out.println("========="+user);

	}
}
