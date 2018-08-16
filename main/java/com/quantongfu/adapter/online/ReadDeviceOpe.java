package com.quantongfu.adapter.online;

import com.quantongfu.adapter.entity.CommonEntity;
import okhttp3.Callback;
import org.json.JSONObject;
import com.quantongfu.adapter.utils.HttpSendCenter;

/**
 * Created by zhaofang on 2018/8/15.
 */
public class ReadDeviceOpe extends BasicOpe{

    public ReadDeviceOpe(String apiKey) {
        super(apiKey);
    }


    @Override
    public JSONObject operation(CommonEntity commonEntity, JSONObject body) {
        return HttpSendCenter.get(apiKey, commonEntity.toUrl());
    }

    @Override
    public void operation(CommonEntity commonEntity, JSONObject body, Callback callback) {

    }
}
