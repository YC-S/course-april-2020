package com.bht.mvc.controller;

import com.bht.mvc.model.Department;
import com.bht.mvc.model.Employee;
import com.bht.mvc.repository.CommonRepository;
import java.net.URI;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    private CommonRepository<Department> repository;

    @Autowired
    public DepartmentController(CommonRepository<Department> repository) {
        this.repository = repository;
    }

    @GetMapping("/id")
    public ResponseEntity<Iterable<Department>> getAllDepartment() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable String id) {
        return ResponseEntity.ok(repository.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createDepartment(@Valid @RequestBody Department department) {
        Department res = repository.save(department);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}").buildAndExpand(res.getDeptid()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/update")
    public ResponseEntity<Department> updateDepartment(
        @RequestBody Department department) {
        if (repository.findById(department.getDeptid()) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        Department target = repository.findById(department.getDeptid());
        repository.delete(target);
        repository.save(department);
        return ResponseEntity.ok(department);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Department> deleteDepartmentById(
        @PathVariable String id) {
        if (repository.findById(id) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        Department target = repository.findById(id);
        repository.delete(target);
        return ResponseEntity.ok(target);
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public ResponseEntity<Department> deleteAll() {
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
