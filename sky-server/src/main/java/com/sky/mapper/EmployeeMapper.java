package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     *
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /***
     * 插入员工数据
     * @param employee
     */
    @Insert("insert into employee (name, username, password, phone, sex, id_number, status, create_time, update_time, create_user, update_user)" +
            "VALUES " +
            "(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
    void insert(Employee employee);

    /**
     * @param employeePageQueryDTO
     * @return
     */
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
/*
    @Update("update employee " +
            "set name = #{name}, username =#{username}, phone=#{phone}, sex=#{sex}, id_number=#{idNumber}, update_time=#{updateTime}, update_user=#{updateUser} " +
            "where id = #{id};")
 */
    void update(Employee employee);

    @Update("update employee " +
            "set status = #{status} " +
            "where id = #{id}")
    void banEmployee(Integer status, Long id);

    @Select("select * from employee where id = #{id} ")
    Employee getbyID(Long id);

}
