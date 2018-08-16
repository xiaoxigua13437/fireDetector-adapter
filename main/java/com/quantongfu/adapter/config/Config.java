package com.quantongfu.adapter.config;
import com.quantongfu.adapter.exception.NBStatus;
import com.quantongfu.adapter.exception.OnenetNBException;
import java.util.Properties;
import java.io.IOException;


/**
 * Created by zhaofang on 2018/8/14.
 * 加载本地的applicaton.properties
 */
public class Config {

    public static String domainName;
    static {
        Properties properties = new Properties();
        try {
            properties.load(Config.class.getClassLoader().getResourceAsStream("application.properties"));
            domainName = (String)properties.get("domainName");
        } catch (IOException e) {
            throw new OnenetNBException(NBStatus.LOAD_CONFIG_ERROR);
        }
    }
    public static String getDomainName() {
        return domainName;
    }

}
