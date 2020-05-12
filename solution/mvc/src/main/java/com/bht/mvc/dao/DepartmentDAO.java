package com.bht.mvc.dao;

import com.bht.mvc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
@Component
public class DepartmentDAO {

    private Department department;

    @Autowired
    public DepartmentDAO(Department department) {
        this.department = department;
    }
}
