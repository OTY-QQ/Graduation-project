package com.gdou.HotelSystem;

import com.gdou.HotelSystem.Base.Base;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room extends Base {
    private Integer roomId;

    private String roomFloor;

    private Integer roomState;

    private Integer typeId;

}