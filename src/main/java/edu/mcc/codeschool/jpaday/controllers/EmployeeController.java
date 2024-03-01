package edu.mcc.codeschool.jpaday.controllers;

import edu.mcc.codeschool.jpaday.models.Employee;
import edu.mcc.codeschool.jpaday.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
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

    @GetMapping("/findCount") //1
    public ResponseEntity<Integer> findCount () {
        return employeeService.findEmployeeCount();
    }

    @GetMapping("/reportsTo") //2
    public ResponseEntity<Integer> employeeReportsTo(){
        return employeeService.employeesReportTo();
    }

    @GetMapping("/findDistinctTitle") //3
    public ResponseEntity<List<String>> findDistinctTitles(){
        return employeeService.findDistinctTitles();
    }

    @GetMapping("/countDistinctTitles")
    public ResponseEntity<Integer> countDistinctTitles(){
        return employeeService.countDistinctTitles();
    }

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


    @PutMapping("/{employeeId}/{lastName}")
    public ResponseEntity<Employee> updateLastName(@PathVariable Integer employeeId, @PathVariable String lastName) {
        return employeeService.updateLastName(employeeId, lastName);
    }
}
