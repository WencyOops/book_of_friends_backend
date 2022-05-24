## Quick Start

#### 1. 创建数据库

```sql
mysql -u root -p

create database book_of_friends;
use book_of_friends;
```

复制src/main/sql/book_of_friends.sql下的sql脚本，运行

##### 2. 配置数据库连接池

application.yml

`url` `username` `password`

```yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost/book_of_friends?serverTimezone=GMT&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false
    username: <username>
    password: <password>

server:
  port: 8081

mybatis:
  mapper-locations: classpath:mapper/*.xml
  type-handlers-package: org.mybatis.mybatis-typehandlers-jsr310
```





