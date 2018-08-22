package com.quantongfu.adapter.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import com.quantongfu.adapter.message.Msg;

/**
 * Created by zhaofang on 2018/8/22.
 */
@Component
@RabbitListener(queues = "msgQueue")
public class MsgReceiver {

    @RabbitHandler
    public void process(Msg msg) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("user receive  : " + "id->"+msg.getId()+", content->"+msg.getContent());
    }

}
