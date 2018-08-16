
package quantongfu.adapter.test;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.HashMap;
import java.util.Map;
import com.quantongfu.adapter.domain.User;

/**
 * Created by zhaofang on 2018/8/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserTest.class)
public class UserTest {


    @Test
    public void checkJson(){

        //String msg = "{\"type\":\"0001\",\"MSG\":\"请求参数错误\"}";

        Map<String, Class> classMap = new HashMap <String, Class>();
        classMap.put("bizContent", User.class);
        System.out.println("====="+classMap);


    }


}
