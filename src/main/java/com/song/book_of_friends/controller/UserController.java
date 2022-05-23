package com.song.book_of_friends.controller;

import com.song.book_of_friends.pojo.User;
import com.song.book_of_friends.service.UserService;
import com.song.book_of_friends.vo.UserReqBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * book_of_friends:
 *
 * @date 2022-05-20-22:21
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable("userId") String uid) {
        userService.deleteUser(Integer.parseInt(uid));
    }

    @PostMapping("/users")
    public void addUser(@RequestBody UserReqBody userReqBody) {
        userService.addUser(userReqBody);
    }
}
