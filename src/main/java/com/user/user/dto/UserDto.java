package com.user.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private Integer departmentId;
}
