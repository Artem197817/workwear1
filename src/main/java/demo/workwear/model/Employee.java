package demo.workwear.model;


import demo.workwear.model.modelEnum.Company;
import demo.workwear.model.modelEnum.ProductionDivision;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String patronymic;
    private ProductionDivision productionDivision;
    private Company company;
    @NotBlank
    private String specialization;

    public Employee(String firstName, String lastName, String patronymic,
                    ProductionDivision productionDivision, Company company,
                    String specialization) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.productionDivision = productionDivision;
        this.company = company;
        this.specialization = specialization;
    }
}
