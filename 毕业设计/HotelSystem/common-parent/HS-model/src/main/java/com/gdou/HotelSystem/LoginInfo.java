package com.gdou.HotelSystem;

import com.gdou.HotelSystem.Base.Base;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LoginInfo extends Base {
    private Integer id;

    private String username;

    private String password;

    private Integer roleId;

}