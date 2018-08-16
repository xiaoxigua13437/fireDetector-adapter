package com.quantongfu.adapter.online;

import com.quantongfu.adapter.entity.CommonEntity;
import okhttp3.Callback;
import org.json.JSONObject;
/**
 * Created by zhaofang on 2018/8/14.
 */
public abstract class BasicOpe {

    protected String apiKey;
    public BasicOpe(String apiKey) {
        this.apiKey = apiKey;
    }
    public abstract JSONObject operation(CommonEntity commonEntity, JSONObject body);
    public abstract void operation(CommonEntity commonEntity, JSONObject body, Callback callback);


}
