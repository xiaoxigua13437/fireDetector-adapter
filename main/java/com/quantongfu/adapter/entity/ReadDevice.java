package com.quantongfu.adapter.entity;

import com.quantongfu.adapter.config.Config;

/**
 * Created by zhaofang on 2018/8/15.
 *
 */
public class ReadDevice extends CommonEntity{


    public ReadDevice(String imei,Integer objId){
        this.imei=imei;
        this.objId=objId;
    }

    public void setObjInstId(Integer objInstId) {
        this.objInstId = objInstId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    @Override
    public String toUrl() {

        StringBuilder url = new  StringBuilder(Config.getDomainName());
        url.append("/nbiot?imei=").append(this.imei);
        url.append("&obj_id=").append(this.objId);
        if(this.objInstId == null){
            url.append("&obj_inst_id=").append(this.objInstId);
        }
        if (this.resId != null) {
            url.append("&res_id=").append(this.resId);
        }
        return url.toString();

    }
}
