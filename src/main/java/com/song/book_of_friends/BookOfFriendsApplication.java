package com.song.book_of_friends;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.song.book_of_friends.mapper")

public class BookOfFriendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookOfFriendsApplication.class, args);
    }

}
