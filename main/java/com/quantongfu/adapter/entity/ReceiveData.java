package com.quantongfu.adapter.entity;


/**
 * Created by zhaofang on 2018/8/16.
 * 用于OneNet数据接收
 */
public class ReceiveData {


    private String type;//标识数据类型，当前版本范围[1,7]

    private String dev_id;//OneNet分配的烟感设备ID

    private String ds_id;//公开协议中的数据流ID

    private String at;//平台时间戳,单位ms

    private String value;//具体数据部分，为设备上传至平台或触发的相关数据



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getDs_id() {
        return ds_id;
    }

    public void setDs_id(String ds_id) {
        this.ds_id = ds_id;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }
}
