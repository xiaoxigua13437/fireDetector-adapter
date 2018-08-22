package com.quantongfu.adapter.delay;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.quantongfu.adapter.message.Msg;
import com.quantongfu.adapter.rabbitmq.RabbitConfig;

/**
 * Created by zhaofang on 2018/8/22.
 * 延迟加载
 */
@Component
public class DelaySender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 在消息上设置时间
     * @param msg
     */
    public void sendDelayMsg(Msg msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(msg.getId() + " 延迟消息发送时间:" + sdf.format(new Date()));
        rabbitTemplate.convertAndSend(RabbitConfig.DELAY_EXCHANGE_NAME, "delay", msg, new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                message.getMessageProperties().setExpiration(msg.getTtl() + "");
                return message;
            }
        });
    }

    /**
     * 在队列上设置时间，则消息不需要任何处理
     * @param msg
     */
    public void sendDelayQueue(Msg msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(msg.getId() + " 延迟队列消息发送时间:" + sdf.format(new Date()));
        rabbitTemplate.convertAndSend(RabbitConfig.DELAY_QUEUE_EXCHANGE_NAME,"delay",  msg);
    }

}
