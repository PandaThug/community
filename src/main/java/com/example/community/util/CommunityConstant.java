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
     * 主题：发帖
     */
    String TOPIC_PUBLISH = "publish";
    /**
     * 主题：删帖
     */
    String TOPIC_DELETE = "delete";
    /**
     * 主题：分享
     */
    String TOPIC_SHARE = "share";
    /**
     * 系统用户ID
     * 这个是数据库中一定要存在的用户，用于发送系统通知。账号system，密码system，一般不登录这个账户，使用这个账户发私信会有bug
     */
    int SYSTEM_USER_ID = 1;
    /**
     * 权限：普通用户, 数据库对应type  0
     */
    String AUTHORITY_USER = "user";
    /**
     * 权限：管理员
     */
    String AUTHORITY_ADMIN = "admin";
    /**
     * 权限：版主
     */
    String AUTHORITY_MODERATOR = "moderator";

}
