package com.song.book_of_friends.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * book_of_friends:
 *
 * @date 2022-05-20-22:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer uid;
    private String username;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String favoriteFood;
    private String favoriteAnimal;
    private String comment;
}
