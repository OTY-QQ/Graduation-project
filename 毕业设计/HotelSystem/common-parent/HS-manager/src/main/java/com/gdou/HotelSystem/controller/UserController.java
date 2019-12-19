package com.gdou.HotelSystem.controller;


import com.gdou.HotelSystem.ServiceImpl.UserServiceImpl;
import com.gdou.HotelSystem.User;
import com.gdou.HotelSystem.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;




    //查找单个用户
    @GetMapping("/findone")
    public UserResponse findOne(Integer userid){
        User user=userService.findById(userid);
        if(user==null){
            return new UserResponse(001,"错误");
        }
        return new UserResponse(200,"成功",user);
    }



    //添加用户
    @PostMapping("/addone")
    public UserResponse AddOne(User user){
        int num=userService.insert(user);
        if(num!=1){
            return new UserResponse(001,"错误");
        }
        return new UserResponse(001,"成功",num);
    }


    //更新用户
    @PostMapping("/updateone")
    public UserResponse UpdateOne(User user){
        int num=userService.update(user);
        if(num!=1){
            return new UserResponse(001,"错误");
        }
        return new UserResponse(001,"成功",num);
    }


    //删除用户
    @DeleteMapping("/deleteone")
    public UserResponse DeleteOne(Integer userid){
        int num=userService.deleteById(userid);
        if(num!=1){
            return new UserResponse(001,"错误");
        }
        return new UserResponse(001,"成功",num);
    }





}
