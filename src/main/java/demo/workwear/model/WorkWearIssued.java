package demo.workwear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class WorkWearIssued {

    private Long employeeId;
    @Id
    private Long workWearId;
}
