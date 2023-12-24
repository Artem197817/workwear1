package demo.workwear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "shoes_issued")
@NoArgsConstructor
public class WorkShoesIssued {

    private Long employeeId;
    @Id
    private Long workShoes;
    private LocalDate replacementDate;
    private LocalDate dateIssued = LocalDate.now();

}
