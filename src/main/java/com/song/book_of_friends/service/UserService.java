package com.song.book_of_friends.service;

import com.song.book_of_friends.pojo.User;
import com.song.book_of_friends.vo.UserReqBody;

import java.util.List;

/**
 * book_of_friends:
 *
 * @date 2022-05-20-22:42
 */
public interface UserService {
    public List<User> getAllUsers();
    public void deleteUser(Integer uid);
    public void addUser(UserReqBody userReqBody);
}
