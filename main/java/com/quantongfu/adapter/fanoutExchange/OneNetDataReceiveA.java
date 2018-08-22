package com.quantongfu.adapter.fanoutExchange;

import com.quantongfu.adapter.domain.DeviceManageModel;
import com.quantongfu.adapter.entity.ReceiveData;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaofang on 2018/8/22.
 * 功能说明:更改烟感设备表中的数据信息
 */
@Component
@RabbitListener(queues = "fanout.A")
public class OneNetDataReceiveA {

    @RabbitHandler
    public void process(ReceiveData receiveData) {
        System.out.println("FanoutReceiverA  : " + receiveData);

        List<DeviceManageModel> deviceManageModelList = new ArrayList<>();
        DeviceManageModel deviceManageModel = new DeviceManageModel();
        deviceManageModel.setDeviceId(receiveData.getDev_id());
        deviceManageModel.setDsId(receiveData.getDs_id());
        deviceManageModel.setOneNetDate(receiveData.getAt());
        deviceManageModel.setDeviceData(receiveData.getValue());
        deviceManageModelList.add(deviceManageModel);





    }




}
