package edu.mcc.codeschool.jpaday.repos;

import edu.mcc.codeschool.jpaday.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findFirstByFirstName(String firstName);

//    Employee countAllByEmployeeId(Integer employeeId);      1

//    List<Employee> findDistinctTitle(String title);      3



    List<Employee> findAllByTitleContaining(String title); // 5

    Employee findEmployeeByTitleAndCityAndPostalCode(String title, String city, String postalCode); //6

    //7- hire date not in entity

    //11
//    Employee updateEmployeeByLastNameContainingIgnoreCase(String lastName);


}
