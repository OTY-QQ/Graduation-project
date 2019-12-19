package com.gdou.HotelSystem;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse<T> {

    private T data=null;
    private String message;
    private Integer code;


    //构造函数
    public UserResponse(Integer code,String message,T data){
        this.data=data;
        this.code=code;
        this.message=message;
    }

    public UserResponse(Integer code,String message){
        this.code=code;
        this.message=message;
    }


}
