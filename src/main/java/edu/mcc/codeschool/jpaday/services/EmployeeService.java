package edu.mcc.codeschool.jpaday.services;

import edu.mcc.codeschool.jpaday.models.Employee;
import edu.mcc.codeschool.jpaday.repos.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    public ResponseEntity<Employee> findEmployeeByFirstName(String firstName){
        return ResponseEntity.ok(employeeRepository.findFirstByFirstName(firstName));
    }

//    public ResponseEntity<Employee> findCountById(Integer employeeId){
//        return ResponseEntity.ok(employeeRepository.countAllByEmployeeId(employeeId));
//    }

// where reports to is not NULL

    //3
//    public List<Employee> findDistinctTitle(String title) {
//        return employeeRepository.findDistinctTitle(title);
//    }

    //5
    public List<Employee> findItStaff(String title){
        return employeeRepository.findAllByTitleContaining(title);
    }
    //6
    public ResponseEntity<Employee> findByTitleCityZip(String title, String city, String postalCode){
        return ResponseEntity.ok(employeeRepository.findEmployeeByTitleAndCityAndPostalCode(title, city, postalCode));
    }
    //7- hire date not in entity

    //11
//    public ResponseEntity<Employee> updateLastName(String lastName){
//        return ResponseEntity.ok(employeeRepository.updateEmployeeByLastNameContainingIgnoreCase(lastName));
//    }
}
