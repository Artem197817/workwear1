package demo.workwear.servise;

import demo.workwear.model.Employee;
import demo.workwear.model.modelEnum.ProductionDivision;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployee();

    Employee saveEmployee(Employee employee);

    Employee findById(Long id);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);

    List<Employee> findAllEmployeeByProductionDivision(ProductionDivision productionDivision);
}
