package com.quantongfu.adapter.online;

import com.quantongfu.adapter.utils.HttpSendCenter;
import com.quantongfu.adapter.entity.CommonEntity;
import okhttp3.Callback;
import org.json.JSONObject;


/**
 * Created by zhaofang on 2018/8/14.
 */
public class CreateDeviceOpe extends BasicOpe{

    public CreateDeviceOpe(String apiKey) {
        super(apiKey);
    }

    @Override
    public JSONObject operation(CommonEntity commonEntity, JSONObject body) {
        return HttpSendCenter.post(this.apiKey, commonEntity.toUrl(), body);
    }
    @Override
    public void operation(CommonEntity commonEntity, JSONObject body, Callback callback) {
        HttpSendCenter.postAsync(this.apiKey, commonEntity.toUrl(), body, callback);
    }
}
