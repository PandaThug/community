package com.example.community.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LoginTicket {

    private Integer id;
    private Integer userId;
    private String ticket;
    private Integer status;
    private Date expired;

}
