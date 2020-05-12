package com.bht.mvc.model;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */

public class EmployeeBuilder {

    private static EmployeeBuilder instance = new EmployeeBuilder();
    private String empid = null;
    private String name = "";
    private String job = "";
    private String manager = null;
    private double salary = 0;
    private String deptid = null;

    private EmployeeBuilder() {

    }

    public static EmployeeBuilder create() {
        return instance;
    }

    public EmployeeBuilder withId(String empid) {
        this.empid = empid;
        return instance;
    }

    public EmployeeBuilder withName(String name) {
        this.name = name;
        return instance;
    }

    public EmployeeBuilder withJob(String job) {
        this.job = job;
        return instance;
    }

    public EmployeeBuilder withManager(String manager) {
        this.manager = manager;
        return instance;
    }

    public EmployeeBuilder withSalary(double salary) {
        this.salary = salary;
        return instance;
    }

    public EmployeeBuilder withDeptId(String deptid) {
        this.deptid = deptid;
        return instance;
    }

    public Employee build() {
        Employee employee = new Employee(this.name, this.job, this.manager,
            this.salary, this.deptid);
        if (empid != null) {
            employee.setEmpid(empid);
        }
        return employee;
    }
}
