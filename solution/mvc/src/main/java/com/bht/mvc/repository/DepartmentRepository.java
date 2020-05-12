package com.bht.mvc.repository;

import com.bht.mvc.model.Department;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
@Repository
public class DepartmentRepository implements CommonRepository<Department> {

    private final Map<String, Department> map = new HashMap<>();

    @Override
    public Department save(Department dao) {
        Department department = map.get(dao.getDeptid());
        if (department != null) {
            department.setDeptid(dao.getDeptid());
            department.setName(dao.getName());
            department.setLoc(dao.getLoc());
        }
        map.put(dao.getDeptid(), dao);
        return map.get(dao.getDeptid());
    }

    @Override
    public void delete(Department dao) {
        map.remove(dao.getDeptid());
    }

    @Override
    public Department findById(String id) {
        return map.get(id);
    }

    @Override
    public Iterable<Department> findAll() {
        return map.entrySet().stream().sorted(entryComparator)
            .map(Map.Entry::getValue).collect(
                Collectors.toList());
    }

    @Override
    public void deleteAll() {
        map.clear();
    }

    private final Comparator<Entry<String, Department>> entryComparator = Comparator
        .comparing((Entry<String, Department> o) -> o.getValue().getLoc());
}
