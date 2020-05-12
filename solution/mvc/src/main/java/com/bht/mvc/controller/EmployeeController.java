package com.bht.mvc.controller;

import com.bht.mvc.model.Employee;
import com.bht.mvc.repository.CommonRepository;
import java.net.URI;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/employees")
public class EmployeeController {

    private CommonRepository<Employee> repository;

    @Autowired
    public EmployeeController(CommonRepository<Employee> repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "id", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Employee>> getAllEmployees() {
        return ResponseEntity.ok(repository.findAll());
    }

    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {
        return ResponseEntity.ok(repository.findById(id));
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> createEmployee(
        @Valid @RequestBody Employee employee) {
        Employee res = repository.save(employee);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}").buildAndExpand(res.getEmpid()).toUri();
        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Employee> updateEmployee(
        @RequestBody Employee employee) {
        if (repository.findById(employee.getEmpid()) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        Employee target = repository.findById(employee.getEmpid());
        repository.delete(target);
        repository.save(employee);
        return ResponseEntity.ok(employee);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Employee> deleteEmployeeById(
        @PathVariable String id) {
        if (repository.findById(id) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        Employee target = repository.findById(id);
        repository.delete(target);
        return ResponseEntity.ok(target);
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public ResponseEntity<Employee> deleteAll() {
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
