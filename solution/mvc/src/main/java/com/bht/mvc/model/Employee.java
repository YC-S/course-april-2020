package com.bht.mvc.model;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
@Component
@Data
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee {

    @NotNull
    private String empid;
    private String name;
    private String job;
    private String manager;
    private LocalDateTime hiredate;
    private double salary;
    private String deptid;

    public Employee() {
        this.empid = UUID.randomUUID().toString();
        this.hiredate = LocalDateTime.now();
    }

    public Employee(String name, String job,
        String manager, double salary, String deptid) {
        this();
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.salary = salary;
        this.deptid = deptid;
    }
}
