package demo.workwear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "shoes_issued")
public class WorkShoesIssued {

    private Long employeeId;
    @Id
    private Long workShoes;
}
