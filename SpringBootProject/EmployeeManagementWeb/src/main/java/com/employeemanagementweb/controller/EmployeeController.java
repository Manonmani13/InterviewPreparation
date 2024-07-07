package com.employeemanagementweb.controller;

import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import com.employeemanagementweb.entity.Employee;
import com.employeemanagementweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        return findPaginated(1, "firstName", "asc", model);
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployeee(@PathVariable(value = "id") long id) {

        employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value="pageNo") int pageNo, @RequestParam("sortField")String sortField,
                                @RequestParam("sortDir")String sortDir,
                                Model model)
    {
        int pageSize=5;
        Page<Employee> page=employeeService.findPaginated(pageNo,pageSize,sortField,sortDir);
        List<Employee> list=new ArrayList<>();
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("totalPage",page.getTotalPages());
        model.addAttribute("totalItems",page.getTotalElements());
        model.addAttribute("sortField",sortField);
        model.addAttribute("sortDir",sortDir);
        model.addAttribute("reverseSortDir",sortDir.equals("asc")?"desc":"asc");
        model.addAttribute("listEmployees",list);
        return "index";
    }


}