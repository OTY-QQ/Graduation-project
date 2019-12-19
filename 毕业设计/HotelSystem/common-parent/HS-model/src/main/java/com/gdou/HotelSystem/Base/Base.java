package com.gdou.HotelSystem.Base;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;


@Setter
@Getter
public class Base {
    private int isRemoved=0;
    private String createTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
}
