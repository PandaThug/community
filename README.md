# community
[![OSCS Status](https://www.oscs1024.com/platform/badge/PandaThug/community.svg?size=small)](https://www.oscs1024.com/project/PandaThug/community?ref=badge_small)  
一个讨论社区，实现登录验证、帖子发布、评论回帖、系统通知、私信、点赞、关注等功能
## 技术栈
● 核心技术：SSM，SpringBoot，Redis，Kafka，Elasticsearch  
● 项目功能：该项目旨在为学校师生提供一个讨论交流分享的平台，用户可登录进行发帖、回复、点赞、私信、评论、搜索等操作。  
● 技术架构：  
1.使用前缀树实现帖子中的敏感词的过滤；使用 Spring Security 实现权限控制，不同用户拥有不同权限。基于SpringBoot+MyBatis+MySQL开发实现论坛基本的注册登录、信息修改、发帖评论等基本功能。  
2.由于查询用户登录凭证和验证码访问频率高，使用 Redis 进行用户登录凭证和验证码的缓存。同时使用 Redis的set实现点赞功能、zset实现关注列表，HyperLogLog记录UV数量、Bitmap统计DAU数量。  
3.使用kafka来构建消息通知，通过生产者消费者模式实现评论、点赞、关注三种类型的通知，提升消息发布性能。  
4.使用Elasticsearch实现全文搜索，并高亮显示搜索关键字。  

