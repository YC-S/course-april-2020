package com.bht.mvc.repository;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */

import com.bht.mvc.model.Employee;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository implements CommonRepository<Employee> {

    private final Map<String, Employee> map = new HashMap<>();


    @Override
    public Employee save(Employee dao) {
        Employee employee = map.get(dao.getEmpid());
        if (employee != null) {
            employee.setDeptid(dao.getDeptid());
            employee.setEmpid(dao.getEmpid());
            employee.setHiredate(dao.getHiredate());
            employee.setJob(dao.getJob());
            employee.setManager(dao.getManager());
            employee.setName(dao.getName());
            employee.setSalary(dao.getSalary());
            dao = employee;
        }
        map.put(dao.getEmpid(), dao);
        return map.get(dao.getEmpid());
    }


    @Override
    public void delete(Employee dao) {
        map.remove(dao.getEmpid());
    }

    @Override
    public Employee findById(String id) {
        return map.get(id);
    }

    @Override
    public Iterable<Employee> findAll() {
        return map.entrySet().stream().sorted(entryComparator)
            .map(Map.Entry::getValue).collect(
                Collectors.toList());
    }

    @Override
    public void deleteAll() {
        map.clear();
    }

    private final Comparator<Entry<String, Employee>> entryComparator = Comparator
        .comparing((Entry<String, Employee> o) -> o.getValue().getHiredate());
}
