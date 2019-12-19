package com.gdou.HotelSystem;

import com.gdou.HotelSystem.Base.Base;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order extends Base {
    private Integer orderId;

    private Integer userId;

    private Integer prepaid;

    private String intoTime;

    private String remarks;

}