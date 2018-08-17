package com.quantongfu.adapter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.quantongfu.adapter.domain.DeviceManageModel;
import net.sf.json.JSONObject;
import com.quantongfu.adapter.entity.ReceiveData;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by zhaofang on 2018/8/17.
 * 模拟数据推送下发数据
 */
@Controller
@RequestMapping("/testJsonController")
public class TestJsonController {




    @RequestMapping("/testByJson")
    @ResponseBody
    public JSONObject testByJson(){

        String result = "{\"msg_signature\":\"msg_signature\",\"nonce\":\"abcdefgh\",\"msg\":[{\"type\":\"1\",\"dev_id\":\"2016617\",\"ds_id\":\"datastream_id\",\"at\":\"1466133706841\",\"value\":\"42\"},{\"type\":\"2\",\"dev_id\":\"2016618\",\"ds_id\":\"datastrea_id\",\"at\":\"146613376841\",\"value\":\"43\"}]}";
        JSONObject jsonObject = JSONObject.fromObject(result);
        for(int i = 0; i < jsonObject.getJSONArray("msg").size(); i++){
            String msg = jsonObject.getJSONArray("msg").get(i).toString();
            JSONObject object = JSONObject.fromObject(msg);
            System.out.println("循环的次数为"+jsonObject.getJSONArray("msg").size());
            System.out.println("======="+object);
            ReceiveData receiveData = (ReceiveData)JSONObject.toBean(object,ReceiveData.class);

            List<DeviceManageModel> deviceManageModelList = new ArrayList<>();
            DeviceManageModel deviceManageModel =  new DeviceManageModel();
            deviceManageModel.setDeviceId(receiveData.getDev_id());
            deviceManageModel.setDsId(receiveData.getDs_id());
            deviceManageModel.setOneNetDate(receiveData.getAt());
            deviceManageModel.setDeviceData(receiveData.getValue());
            deviceManageModelList.add(deviceManageModel);

            System.out.println("循环打印"+deviceManageModelList.get(0).toString());

        }


        return jsonObject;
    }
}
