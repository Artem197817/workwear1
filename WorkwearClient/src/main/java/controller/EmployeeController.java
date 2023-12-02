package controller;

import demo.workwear.model.Employee;
import org.springframework.web.client.RestTemplate;
import service.EmployeeService;

import java.util.List;

public class EmployeeController {

    private final RestTemplate restTemplate;
    private final String urlEmployee = "http://localhost:8080/employee";

    private final EmployeeService service;

    public EmployeeController(RestTemplate restTemplate, EmployeeService service) {
        this.restTemplate = restTemplate;
        this.service = service;
    }

    public List<Employee> findAllEmployee() {
        String employee = restTemplate.getForObject(urlEmployee, String.class);
        return service.parserJsonEmployee(employee);
    }
}
