package com.sky.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

@ApiModel(value="新增员工数据")
@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
