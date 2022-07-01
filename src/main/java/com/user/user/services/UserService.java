package com.user.user.services;

import com.user.user.ValueObject.ResponseTemplateVo;
import com.user.user.dto.UserDto;
import com.user.user.model.User;

public interface UserService {
    User saveUser(UserDto userDto);

    ResponseTemplateVo getUserWithDepartment(Integer userid);
}
