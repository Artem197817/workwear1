package demo.workwear.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import demo.workwear.model.modelEnum.Company;
import demo.workwear.model.modelEnum.ProductionDivision;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private ProductionDivision productionDivision;
    private Company company;
    private String specialization;

}
