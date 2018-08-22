package com.quantongfu.adapter.domain;

/**
 * Created by zhaofang on 2018/8/14.
 */
public class User {

    private String id ;

    private String username;

    private String password;




    public User user(String id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
