package com.user.user.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentVO {

    private  Integer  departmentId;
    private String departmentName;
    private  String departmentAddress;
    private String departmentCode;
}
