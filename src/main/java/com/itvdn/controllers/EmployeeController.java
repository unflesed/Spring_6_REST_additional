package com.itvdn.controllers;

import com.itvdn.persistence.dao.services.interfaces.EmployeeSimpleService;
import com.itvdn.persistence.model.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@EnableWebMvc
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeSimpleService employeeSimpleService;


    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> addNewEmployee(@RequestBody Employee employee) throws InterruptedException {
        employeeSimpleService.addEmployee(employee);
        return employeeSimpleService.findAll();
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> listAllEmployee() throws InterruptedException {
        return employeeSimpleService.findAll();
    }

    @GetMapping(value = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> deleteEmployee(@PathVariable long id, ModelAndView modelAndView) throws InterruptedException {
        employeeSimpleService.removeById(id);
        return employeeSimpleService.findAll();
    }
    @PostMapping(value = "/findByName", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> findEmployeeByName(@RequestParam("name") String name) {
        return employeeSimpleService.findEmployeeByName(name);
    }
    @PostMapping(value = "/findByNameAndPosition", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> findEmployeeByNameAndPosition(@RequestParam("name") String name,
                                                      @RequestParam("position") String position) {
        return employeeSimpleService.findEmployeeByNameAndPosition(name, position);
    }

}
