package com.quantongfu.adapter.dao;

import com.quantongfu.adapter.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaofang on 2018/8/14.
 */
@Repository("userDao")
public interface UserDao {

    User findByUserName(String userName);

}
