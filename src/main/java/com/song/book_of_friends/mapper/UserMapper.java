package com.song.book_of_friends.mapper;

import com.song.book_of_friends.pojo.User;
import com.song.book_of_friends.vo.UserReqBody;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * book_of_friends:
 *
 * @date 2022-05-20-22:37
 */
@Repository
public interface UserMapper {
    public List<User> getAllUsers();
    public void deleteUser(Integer uid);
    public void addUser(UserReqBody userReqBody);
}
