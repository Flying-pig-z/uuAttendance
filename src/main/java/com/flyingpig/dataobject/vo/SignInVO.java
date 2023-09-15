package com.flyingpig.dataobject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInVO {
    //课程id
    public Integer id;
    public String latitude;
    public String longitude;
}
