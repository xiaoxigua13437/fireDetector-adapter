package com.quantongfu.adapter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.quantongfu.adapter.online.CreateDeviceOpe;
import com.quantongfu.adapter.entity.CreateDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaofang on 2018/8/14.
 * 创建OneNet烟感设备类
 */
@Controller
@RequestMapping("/createDeviceController")
public class CreateDeviceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateDeviceController.class);


    /**
     * 功能说明:创建烟感设备
     * @return
     */
    @RequestMapping("/createDevice")
    @ResponseBody
    public String createDevice(){

        String apiKey = "h9qPyUn7Yhe3OonIIsMZYs8kfVY=";
        String imei = "865820031095032";

        CreateDeviceOpe deviceOpe = new CreateDeviceOpe(apiKey);
        CreateDevice createdevice = new CreateDevice("烟感设备001", "865820031095032", "460041998708004");
        String result = deviceOpe.operation(createdevice, createdevice.toJsonObject()).toString();

        System.out.println("========="+result);

        LOGGER.info(deviceOpe.operation(createdevice, createdevice.toJsonObject()).toString());
        return result;

    }

}
