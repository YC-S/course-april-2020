package com.bht.mvc.dao;

import com.bht.mvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
@Component
public class EmployeeDAO {

    private Employee employee;

    @Autowired
    public EmployeeDAO(Employee employee) {
        this.employee = employee;
    }
}
