package demo.workwear.repository;

import demo.workwear.model.Employee;
import demo.workwear.model.modelEnum.ProductionDivision;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findAllEmployeeByProductionDivision(ProductionDivision productionDivision);
    List<Employee> findAllEmployeeByLastName (String lastName);
}
