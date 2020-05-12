package com.bht.mvc.model;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
public class DepartmentBuilder {
    private static DepartmentBuilder instance = new DepartmentBuilder();
    private String deptid = null;
    private String name = "";
    private String loc = "";

    private DepartmentBuilder() {

    }

    public static DepartmentBuilder create() {
        return instance;
    }

    public DepartmentBuilder withDeptid(String deptid) {
        this.deptid = deptid;
        return instance;
    }

    public DepartmentBuilder withName(String name) {
        this.name = name;
        return instance;
    }

    public DepartmentBuilder withLoc(String loc) {
        this.loc = loc;
        return instance;
    }

    public Department build() {
        Department department = new Department(this.name, this.loc);
        if (deptid != null) {
            department.setDeptid(deptid);
        }
        return department;
    }
}
