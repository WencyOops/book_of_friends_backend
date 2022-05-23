package com.song.book_of_friends.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * book_of_friends:
 *
 * @date 2022-05-21-20:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserReqBody {
    String username;
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate birthday;
    String favoriteFood;
    String favoriteAnimal;
    String comment;
}
