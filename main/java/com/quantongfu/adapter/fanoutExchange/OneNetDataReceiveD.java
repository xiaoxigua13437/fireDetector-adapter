package com.quantongfu.adapter.fanoutExchange;

import com.quantongfu.adapter.entity.ReceiveData;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhaofang on 2018/8/22.
 */
@Component
@RabbitListener(queues = "fanout.D")
public class OneNetDataReceiveD {

    @RabbitHandler
    public void process(ReceiveData receiveData) {
        System.out.println("FanoutReceiverA  : " + receiveData);


    }




}
