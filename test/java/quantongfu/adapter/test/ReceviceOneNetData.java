package quantongfu.adapter.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import net.sf.json.JSONObject;
import com.quantongfu.adapter.entity.ReceiveData;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by zhaofang on 2018/8/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReceviceOneNetData.class)
public class ReceviceOneNetData {

    @Autowired
    private ReceiveData receiveOneNetData;

    @Test
    public void receiveTest(){

        boolean isSuccess = false;

        String msg = "{\"type\":\"1\",\"dev_id\":\"2016617\",\"ds_id\":\"datastream_id\",\"at\":\"1466133706841\",\"value\":\"42\"}";

        JSONObject jsonObject = JSONObject.fromObject(msg);


        receiveOneNetData = (ReceiveData)JSONObject.toBean(jsonObject,ReceiveData.class);
        if(receiveOneNetData.getDev_id()==null){
            System.out.println("接收数据错误");

        }

        //根据OneNet推送的数据
        List<ReceiveData> receiveDataList = new ArrayList<ReceiveData>();







    }





}
