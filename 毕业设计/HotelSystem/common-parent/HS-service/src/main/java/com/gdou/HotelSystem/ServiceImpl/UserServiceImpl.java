package com.gdou.HotelSystem.ServiceImpl;


import com.gdou.HotelSystem.ServiceImpl.Base.BaseServiceImpl;
import com.gdou.HotelSystem.IService.IUserService;
import com.gdou.HotelSystem.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    //根据id查找
    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //删除
    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    //更新
    @Override
    public int update(User user) {
        int num= userMapper.updateByPrimaryKeySelective(user);
        return num;
    }

    //添加
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }



}
