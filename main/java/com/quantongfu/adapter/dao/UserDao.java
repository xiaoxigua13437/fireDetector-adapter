package com.quantongfu.adapter.dao;

import com.quantongfu.adapter.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhaofang on 2018/8/14.
 */
@Repository("userDao")
public interface UserDao {

    /**
     * 查询用户名
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * 批量修改用户
     * @param orders
     */
    void batchUpdate(List<User> orders);



}
