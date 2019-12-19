package com.gdou.HotelSystem.ServiceImpl.Base;


import com.gdou.HotelSystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T>{

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;

}
