package com.quantongfu.adapter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.quantongfu.adapter.entity.QueryDevice;
import com.quantongfu.adapter.online.DeleteDeviceOpe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by zhaofang on 2018/8/14.
 * 删除OneNet烟感设备类
 */
@Controller
@RequestMapping("/deleteDeviceController")
public class DeleteDeviceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteDeviceController.class);


    /**
     * 功能说明:删除烟感设备
     * @return
     */
    @RequestMapping("/deleteDevice")
    @ResponseBody
    public String deleteDevice(){

        String apiKey = "h9qPyUn7Yhe3OonIIsMZYs8kfVY=";
        String deviceId = "31153975";

        DeleteDeviceOpe deleteDeviceOpe = new DeleteDeviceOpe(apiKey);
        QueryDevice queryDevice = new QueryDevice(deviceId);

        String result = deleteDeviceOpe.operation(queryDevice,null).toString();
        System.out.println("========="+result);
        LOGGER.info(deleteDeviceOpe.operation(queryDevice, null).toString());

        return result;

    }

}
