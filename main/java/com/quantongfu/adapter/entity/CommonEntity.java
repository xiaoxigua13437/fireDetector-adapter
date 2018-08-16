package com.quantongfu.adapter.entity;

import org.json.JSONObject;


/**
 * Created by zhaofang on 2018/8/14.
 */
public abstract class CommonEntity {

    // 设备imei号，平台唯一，必填参数
    protected String imei;
    // ISPO标准中的Object ID
    protected Integer objId;
    // ISPO标准中的Object Instance ID
    protected Integer objInstId;
    // ISPO标准中的Resource ID
    protected Integer resId;
    public JSONObject toJsonObject(){return null;}
    public abstract String toUrl();



}
