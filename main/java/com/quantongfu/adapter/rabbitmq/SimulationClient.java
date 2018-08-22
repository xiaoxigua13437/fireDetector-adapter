package com.quantongfu.adapter.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
/**
 * Created by zhaofang on 2018/8/22.
 */
public class SimulationClient {

    public static void main(String[] args) {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername("guest");
            factory.setPassword("guest");
            factory.setHost("127.0.0.1");
            factory.setPort(5672);
            Connection conn = factory.newConnection();
            Channel channel = conn.createChannel();

//            channel.qu
            channel.queueDeclare("hello", false, false, false, null);
            String message = "Hello World!";
            channel.basicPublish("", "hello", null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");

            channel.close();
            conn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }


}
