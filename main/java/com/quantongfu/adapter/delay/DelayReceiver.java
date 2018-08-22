package com.quantongfu.adapter.delay;



import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.quantongfu.adapter.rabbitmq.RabbitConfig;
import com.quantongfu.adapter.message.Msg;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaofang on 2018/8/22.
 */
@Component
public class DelayReceiver {

    @RabbitListener(queues = {RabbitConfig.PROCESS_QUEUE})
    public void process(Msg msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间: " + sdf.format(new Date()) + " ---> msg：【" + msg + "]");
    }
}
