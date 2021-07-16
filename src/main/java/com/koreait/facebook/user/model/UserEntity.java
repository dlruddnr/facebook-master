package com.koreait.facebook.user.model;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private int iuser;
    private String provider;
    private String email;
    private String pw;
    private String nm;
    private String tel;
    private String authCd;
    private String mainProfile;
    private String regdt;
}