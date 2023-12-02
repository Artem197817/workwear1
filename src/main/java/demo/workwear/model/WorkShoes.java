package demo.workwear.model;

import demo.workwear.model.modelEnum.WorkShoesType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Entity
@Data
@Table(name = "workShoes")
@NoArgsConstructor
public class WorkShoes {

    @Id
    @GeneratedValue
    private Long id;
    @Size(min = 34, max = 48)
    private int workShoesSize;
    private WorkShoesType workShoesType;
    @Column(name = "shoes_issue")
    boolean isIssueShoes = false;

}
