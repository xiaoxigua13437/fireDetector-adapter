package com.quantongfu.adapter.controller;

import com.quantongfu.adapter.entity.QueryDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.quantongfu.adapter.online.QueryDeviceOpe;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaofang on 2018/8/14.
 * 查询OneNet烟感设备类
 */
@Controller
@RequestMapping("/queryDeviceController")
public class QueryDeviceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryDeviceController.class);


    /**
     *功能说明:查询烟感设备
     * @return
     */
    @RequestMapping("/queryDevice")
    @ResponseBody
    public String queryDevice(){

        String apiKey = "h9qPyUn7Yhe3OonIIsMZYs8kfVY=";
        String deviceId = "31153970";

        QueryDeviceOpe queryDeviceOpe = new QueryDeviceOpe(apiKey);
        QueryDevice queryDevice = new QueryDevice(deviceId);

        String result = queryDeviceOpe.operation(queryDevice,null).toString();
        System.out.println("========="+result);
        LOGGER.info(queryDeviceOpe.operation(queryDevice, null).toString());

        return result;


    }



}
