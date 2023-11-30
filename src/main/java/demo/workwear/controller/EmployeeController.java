package demo.workwear.controller;

import demo.workwear.model.Employee;
import demo.workwear.servise.EmployeeService;
import lombok.Data;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Data
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping
    public List<Employee> findAllEmployee () {
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee findById (@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("save_employee")
    public String saveEmployee (@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return "Employee successfully saved";
    }
    @PutMapping("update_employee")
    public Employee updateEmployee (@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }
    
}
