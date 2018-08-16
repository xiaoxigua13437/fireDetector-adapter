package com.quantongfu.adapter.entity;


import com.quantongfu.adapter.config.Config;

/**
 * Created by zhaofang on 2018/8/14.
 */
public class QueryDevice extends CommonEntity{

    //OneNet平台分配的设备ID
    private String deviceId;

    public QueryDevice(String deviceId){
        this.deviceId=deviceId;
    }

    @Override
    public String toUrl() {
        StringBuilder url = new StringBuilder(Config.getDomainName());
        url.append("/devices/"+deviceId);
        return url.toString();
    }


}
