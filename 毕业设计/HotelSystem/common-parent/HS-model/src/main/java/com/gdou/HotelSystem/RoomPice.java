package com.gdou.HotelSystem;

import com.gdou.HotelSystem.Base.Base;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomPice extends Base {
    private Integer typeId;

    private String typeName;

    private Integer typePice;

    private String picture1;

    private String picture2;

    private String picture3;

    private String remarks;

}