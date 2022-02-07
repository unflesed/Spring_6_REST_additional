package com.itvdn.persistence.dao.services.implementations;

import com.google.common.collect.Lists;
import com.itvdn.persistence.dao.repositories.EmployeeRepository;
import com.itvdn.persistence.dao.services.interfaces.EmployeeSimpleService;
import com.itvdn.persistence.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSimpleServiceImpl implements EmployeeSimpleService {
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() throws InterruptedException {
        return Lists.newArrayList(employeeRepository.findAll());
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void removeById(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findEmployeeByName(String name) {
        return employeeRepository.findEmployeeByName(name);
    }

    @Override
    public List<Employee> findEmployeeByNameAndPosition(String name, String position) {
        return employeeRepository.findEmployeeByNameAndPosition(name, position);
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
