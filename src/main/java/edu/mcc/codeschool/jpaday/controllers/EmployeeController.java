package edu.mcc.codeschool.jpaday.controllers;

import edu.mcc.codeschool.jpaday.models.Employee;
import edu.mcc.codeschool.jpaday.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/findByFirstName/{firstName}")
    public ResponseEntity<Employee> findFirstName(@PathVariable String firstName){
        return employeeService.findEmployeeByFirstName(firstName);
    }

//    @GetMapping("/findCount")
//    public ResponseEntity<Employee> findCount (Integer employeeId) {
//        return employeeService.findCountById(employeeId);
//    }

// where reports to is not NULL

    //3
//    @GetMapping("/findJobTitles")
//    public ResponseEntity<List<Employee>> findDistinctTitles(String title) {
//        List<Employee> employees = employeeService.findDistinctTitle(title);
//        return ResponseEntity.ok(employees);
//    }

// 5
    @GetMapping("/{title}")
    public ResponseEntity<List<Employee>> findItStaff(@PathVariable String title){
        List<Employee> employees = employeeService.findItStaff(title);
        return ResponseEntity.ok(employees);
    }

    //6
    @GetMapping("/{title}/{city}/{postalCode}")
    public ResponseEntity<Employee> findTitleCityZip(@PathVariable String title, @PathVariable String city, @PathVariable String postalCode) {
        return employeeService.findByTitleCityZip(title, city, postalCode);
    }
    //7- hire date not in entity???
    //11
//    @PutMapping("/{lastName}")
//    public ResponseEntity<Employee> updateLastName(@PathVariable String lastName) {
//        return employeeService.updateLastName(lastName);
//    }
}
