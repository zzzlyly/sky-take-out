package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeLoginDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);

    /**
     *查询员工
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 编辑员工信息
     * @param employeeDTO
     * @return
     */
    Employee update(EmployeeDTO employeeDTO);

    /**
     * 启用、禁用员工账号
     * @param status
     * @param id
     */
    void banEmployee(Integer status, Long id);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Employee getbyTD(Long id);
}
