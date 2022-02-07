package com.itvdn.persistence.dao.services.interfaces;

import com.itvdn.persistence.model.Employee;
import java.util.List;


public interface EmployeeSimpleService {
    List<Employee> findAll() throws InterruptedException;

    Employee addEmployee(Employee employee);

    void removeById(long id);

    List<Employee> findEmployeeByName(String name);

    List<Employee> findEmployeeByNameAndPosition(String name, String position);
}
