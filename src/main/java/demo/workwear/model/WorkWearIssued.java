package demo.workwear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class WorkWearIssued {

    private Long employeeId;
    @Id
    private Long workWearId;
}
