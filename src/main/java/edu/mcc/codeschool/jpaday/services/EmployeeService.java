package edu.mcc.codeschool.jpaday.services;

import edu.mcc.codeschool.jpaday.models.Employee;
import edu.mcc.codeschool.jpaday.repos.EmployeeRepository;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public ResponseEntity<Integer> findEmployeeCount(){
        return ResponseEntity.ok(employeeRepository.findEmployeeCount());
    }

    public ResponseEntity<Integer> employeesReportTo() {
        return ResponseEntity.ok(employeeRepository.employeesReportTo());
    }

    public ResponseEntity<List<String>> findDistinctTitles(){
        return ResponseEntity.ok(employeeRepository.findDistinctTitles());
    }

    public ResponseEntity<Integer> countDistinctTitles(){
        return ResponseEntity.ok(employeeRepository.countDistinctTitles());
    }


    //5
    public List<Employee> findItStaff(String title){
        return employeeRepository.findAllByTitleContaining(title);
    }
    //6
    public ResponseEntity<Employee> findByTitleCityZip(String title, String city, String postalCode){
        return ResponseEntity.ok(employeeRepository.findEmployeeByTitleAndCityAndPostalCode(title, city, postalCode));
    }



    //11
    public ResponseEntity<Employee> updateLastName(Integer employeeId, String lastName){
        employeeRepository.updateLastName(lastName, employeeId);
        return ResponseEntity.ok(employeeRepository.findById(employeeId).get());
    }
}
