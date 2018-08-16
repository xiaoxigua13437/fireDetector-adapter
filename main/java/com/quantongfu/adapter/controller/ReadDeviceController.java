package com.quantongfu.adapter.controller;

import com.quantongfu.adapter.entity.ReadDevice;
import com.quantongfu.adapter.online.ReadDeviceOpe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaofang on 2018/8/15.
 * 读取烟感设备资源类
 */
@Controller
@RequestMapping("/readDeviceController")
public class ReadDeviceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadDeviceController.class);


    /**
     * 功能说明:读取烟感设备资源
     * @return
     */
    @RequestMapping("/readDevice")
    @ResponseBody
    public String readDevice(){

        String apiKey = "";
        String imei = "";
        Integer objId = 3200;
        Integer objInstId = 0;
        Integer readResId = 5500;
        ReadDeviceOpe readDeviceOpe = new ReadDeviceOpe(apiKey);
        ReadDevice readDevice = new ReadDevice(imei,objId);
        readDevice.setResId(readResId);
        readDevice.setObjInstId(objInstId);

        String result = readDeviceOpe.operation(readDevice, null).toString();
        LOGGER.info(readDeviceOpe.operation(readDevice, null).toString());

        return result;



    }


}
