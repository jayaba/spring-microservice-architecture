package com.user.user.services.Impl;

import com.user.user.ValueObject.DepartmentVO;
import com.user.user.ValueObject.ResponseTemplateVo;
import com.user.user.dto.UserDto;
import com.user.user.model.User;
import com.user.user.repos.UserRepository;
import com.user.user.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
     RestTemplate restTemplate;

    @Override
    public User saveUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setDepartmentId(userDto.getDepartmentId());
        userRepository.save(user);
        return user;

    }

    @Override
    public ResponseTemplateVo getUserWithDepartment(Integer userid) {
        ResponseTemplateVo responseTemplateVo = new ResponseTemplateVo(); //return type is Response TemplateVo

        Optional<User> byId = userRepository.findById(userid);

        DepartmentVO departmentVO = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/get/"+byId.get().getDepartmentId(),DepartmentVO.class); //call the rest template to get the dep id related to this user

        responseTemplateVo.setDepartmentVO(departmentVO);
        responseTemplateVo.setUser(byId.get());

        return responseTemplateVo;
    }
}
