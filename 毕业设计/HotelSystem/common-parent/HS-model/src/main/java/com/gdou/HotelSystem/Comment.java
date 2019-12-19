package com.gdou.HotelSystem;

import com.gdou.HotelSystem.Base.Base;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Comment extends Base {
    private Integer commentId;

    private Integer userId;

    private String commentContent;

    private Integer typeId;

}