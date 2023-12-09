package demo.workwear.model;


import demo.workwear.model.modelEnum.WorkWearHeight;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "workWear")
public class WorkWear {

    public static final int ISSUE = -1;
    public static final int NOT_ISSUE = 1;

    @Id
    @GeneratedValue
    private Long id;
    private String modelWorkWear;
    private WorkWearType workWearType;
    private WorkWearSize workWearSize;
    private WorkWearHeight workWearHeight;
    private int WorkWearStatus = NOT_ISSUE;




}
