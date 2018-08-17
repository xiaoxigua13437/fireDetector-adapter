package com.quantongfu.adapter.domain;

import java.util.Date;

/**
 * Created by zhaofang on 2018/8/17.
 * 烟感设备表
 */
public class DeviceManageModel {

    private Integer id;//烟感平台的ID

    private String deviceId;//OneNet平台分配的设备ID

    private String dsId;//公开协议中数据流ID

    private String deviceKey;// OneNet生成的烟感设备的MasterKey

    private String deviceName;//烟感设备名称

    private String deviceDesc;//烟感设备描述

    private String deviceTag;//烟感设备标签

    private String deviceProtocol;//烟感设备协议

    private String deviceData;//烟感设备数据流

    private String deviceLocation;//烟感设备位置

    private String deviceIsmi;//烟感设备ISMI

    private String deviceImei;//烟感设备IMEI

    //0-火警报警解除 1-在线 2-火警报警 3-拆除报警 4-拆除报警解除 5-低电压报警 6-低电压报警解除 7-探头故障报警 8-探头故障报警解除 9-离线 10-心跳(12小时一次)
    private String deviceStatus;//烟感设备状态

    private String subscribeResource;//是否订阅资源 1-订阅 2-未定

    private Date createDate;//烟感设备信息创建时间

    private String createOperId;//创建人

    private Date updateDate;//烟感设备信息修改时间

    private String updateOperId;//修改人

    private String remark;//备注

    private String OneNetDate;//OneNet平台时间戳




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getDeviceProtocol() {
        return deviceProtocol;
    }

    public void setDeviceProtocol(String deviceProtocol) {
        this.deviceProtocol = deviceProtocol;
    }

    public String getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(String deviceData) {
        this.deviceData = deviceData;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getDeviceIsmi() {
        return deviceIsmi;
    }

    public void setDeviceIsmi(String deviceIsmi) {
        this.deviceIsmi = deviceIsmi;
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getSubscribeResource() {
        return subscribeResource;
    }

    public void setSubscribeResource(String subscribeResource) {
        this.subscribeResource = subscribeResource;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateOperId() {
        return createOperId;
    }

    public void setCreateOperId(String createOperId) {
        this.createOperId = createOperId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateOperId() {
        return updateOperId;
    }

    public void setUpdateOperId(String updateOperId) {
        this.updateOperId = updateOperId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    public String getOneNetDate() {
        return OneNetDate;
    }

    public void setOneNetDate(String oneNetDate) {
        OneNetDate = oneNetDate;
    }
}

