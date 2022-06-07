package com.example.community.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private Integer id;
    private Integer fromId;
    private Integer toId;
    private String conversationId;
    private String content;
    private String status;
    private Date createTime;

}
