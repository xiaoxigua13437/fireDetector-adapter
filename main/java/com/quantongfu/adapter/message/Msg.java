package com.quantongfu.adapter.message;

import java.io.Serializable;

/**
 * Created by zhaofang on 2018/8/22.
 */
public class Msg implements Serializable {

    private int id;
    private String content;
    private long ttl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    @Override
    public String toString() {
        return "Msg{" + "id=" + id + ", content='" + content + '\'' + ", ttl=" + ttl + '}';
    }

}
