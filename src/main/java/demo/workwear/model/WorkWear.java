package demo.workwear.model;


import demo.workwear.model.modelEnum.WorkWearHeight;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "workWear")
@NoArgsConstructor
public class WorkWear {

    @Id
    @GeneratedValue
    private Long id;
    private WorkWearType workWearType;
    private WorkWearSize workWearSize;
    private WorkWearHeight workWearHeight;
    @Column(name = "wear_issue")
    boolean isIssueWear = false;



}
