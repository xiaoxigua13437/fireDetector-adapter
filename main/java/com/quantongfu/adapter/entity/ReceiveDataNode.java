package com.quantongfu.adapter.entity;

import java.util.List;

/**
 * Created by zhaofang on 2018/8/17.
 */
public class ReceiveDataNode {

    private String msg_signature;//消息摘要

    private String nonce;//用于计算消息摘要的随机串

    private List<ReceiveData> receiveDataList;//具体数据部分


    public List<ReceiveData> getReceiveDataList() {
        return receiveDataList;
    }

    public void setReceiveDataList(List<ReceiveData> receiveDataList) {
        this.receiveDataList = receiveDataList;
    }

    public String getMsg_signature() {
        return msg_signature;
    }

    public void setMsg_signature(String msg_signature) {
        this.msg_signature = msg_signature;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }
}
