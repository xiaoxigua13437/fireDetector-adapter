package com.quantongfu.adapter.rabbitmq;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.core.AmqpTemplate;
import com.quantongfu.adapter.message.Msg;
/**
 * Created by zhaofang on 2018/8/22.
 */
@Component
public class MsgSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(Msg msg) {
        System.out.println("msg send : " + msg.toString());
        this.rabbitTemplate.convertAndSend("msgQueue", msg);
    }

}
