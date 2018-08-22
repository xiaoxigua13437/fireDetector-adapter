package com.quantongfu.adapter.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhaofang on 2018/8/22.
 * 未处理事件实体
 */
public class EventHandlingModel implements Serializable {

    //主键id
    private int id;

    //0-火警报警解除 1-在线 2-火警报警 3-拆除报警 4-拆除报警解除 5-低电压报警 6-低电压报警解除 7-探头故障报警 8-探头故障报警解除 9-离线 10-心跳(12小时一次)
    private String event_type;

    //首次报警消息时间
    private Date event_start_time;

    //最后报警消息时间
    private Date event_end_time;

    //OneNet分配的烟感设备id
    private String device_id;

    //烟感设备型号
    private String device_tags;

    //烟感设备名称
    private String device_name;

    //报警位置
    private String event_area;

    //报警消息次数
    private int event_num;

    //报警处理时间
    private Date oper_date;

    //处理人
    private String event_oper_persion;

    //事件创建时间
    private Date create_date;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public Date getEvent_start_time() {
        return event_start_time;
    }

    public void setEvent_start_time(Date event_start_time) {
        this.event_start_time = event_start_time;
    }

    public Date getEvent_end_time() {
        return event_end_time;
    }

    public void setEvent_end_time(Date event_end_time) {
        this.event_end_time = event_end_time;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getDevice_tags() {
        return device_tags;
    }

    public void setDevice_tags(String device_tags) {
        this.device_tags = device_tags;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public String getEvent_area() {
        return event_area;
    }

    public void setEvent_area(String event_area) {
        this.event_area = event_area;
    }

    public int getEvent_num() {
        return event_num;
    }

    public void setEvent_num(int event_num) {
        this.event_num = event_num;
    }

    public Date getOper_date() {
        return oper_date;
    }

    public void setOper_date(Date oper_date) {
        this.oper_date = oper_date;
    }

    public String getEvent_oper_persion() {
        return event_oper_persion;
    }

    public void setEvent_oper_persion(String event_oper_persion) {
        this.event_oper_persion = event_oper_persion;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}
