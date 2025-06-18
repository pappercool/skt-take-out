package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    @Insert("INSERT INTO employee " +
            "(name, username, password, phone, sex, id_number, create_time, update_time, create_user, update_user, status) " +
            "VALUES " +
            "(#{name}, #{username}, #{password}, #{phone}, #{sex}, #{idNumber}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void save(Employee employee);



    Page<Employee> page(EmployeePageQueryDTO employeePageQueryDTO);


    void updateStatus(Employee employee);


    Employee selectEmployeeById(Long id);
}
