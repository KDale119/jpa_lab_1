package edu.mcc.codeschool.jpaday.repos;

import edu.mcc.codeschool.jpaday.models.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.sql.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findFirstByFirstName(String firstName);

    @Query(value = "Select count(*) from Employees")
    Integer findEmployeeCount(); //1

    @Query(value = "Select count(*) from Employees where reportsTo is not null")
    Integer employeesReportTo(); //2

    @Query(value = "Select distinct title from Employees")
    List<String> findDistinctTitles(); //3

    @Query(value = "Select count(distinct title) from Employees")
    Integer countDistinctTitles(); // 4


    List<Employee> findAllByTitleContaining(String title); // 5

    Employee findEmployeeByTitleAndCityAndPostalCode(String title, String city, String postalCode); //6

   // List<Employee> findByHireDateGreaterThanEqual(Date hireDate); 7

    //8

    //9

    //11
    @Modifying
    @Transactional
    @Query(value = "Update Employees e set e.lastName = ?1 where e.employeeId = ?2")
    Integer updateLastName(String lastName, Integer employeeId);


}
