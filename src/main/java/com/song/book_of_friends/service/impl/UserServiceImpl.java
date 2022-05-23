package com.song.book_of_friends.service.impl;

import com.song.book_of_friends.mapper.UserMapper;
import com.song.book_of_friends.pojo.User;
import com.song.book_of_friends.service.UserService;
import com.song.book_of_friends.vo.UserReqBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * book_of_friends:
 *
 * @date 2022-05-20-22:42
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public void deleteUser(Integer uid) {
        userMapper.deleteUser(uid);
    }

    @Override
    public void addUser(UserReqBody userReqBody) {
        userMapper.addUser(userReqBody);
    }
}
