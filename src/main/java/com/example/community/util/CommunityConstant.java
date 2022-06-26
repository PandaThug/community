package com.example.community.util;

public interface CommunityConstant {

    /**
     * 激活成功
     */
    Integer ACTIVATION_SUCCESS = 0;
    /**
     * 重复激活
     */
    Integer ACTIVATION_REPEAT = 1;
    /**
     * 激活失败
     */
    Integer ACTIVATION_FAILURE = 2;
    /**
     * 默认状态的登录凭证超时时间
     */
    Integer DEFAULT_EXPIRED_SECONDS = 3600 * 12;
    /**
     * 记住状态下的登录凭证超时时间
     */
    Integer REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;
    /**
     * 实体类型：帖子
     */
    Integer ENTITY_TYPE_POST = 1;
    /**
     * 实体类型：评论
     */
    Integer ENTITY_TYPE_COMMENT = 2;
    /**
     * 实体类型：用户
     */
    Integer ENTITY_TYPE_USER = 3;
    /**
     * 主题：评论
     */
    String TOPIC_COMMENT = "comment";
    /**
     * 主题：点赞
     */
    String TOPIC_LIKE = "like";
    /**
     * 主题：关注
     */
    String TOPIC_FOLLOW = "follow";
    /**
     * 系统用户ID
     */
    int SYSTEM_USER_ID = 1;
}
