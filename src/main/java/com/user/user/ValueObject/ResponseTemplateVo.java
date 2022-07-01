package com.user.user.ValueObject;

import com.user.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVo {

    private User user;
    private DepartmentVO departmentVO;
}
