package demo.workwear.model;

import demo.workwear.model.modelEnum.WorkShoesType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
@Table(name = "workShoes")
public class WorkShoes {

    public static final int ISSUE = -1;
    public static final int NOT_ISSUE = 1;

    @Id
    @GeneratedValue
    private Long id;
    private String modelWorkShoes;

    private int workShoesSize;
    private WorkShoesType workShoesType;
    // @NotBlank
    private int workShoesStatus;

    public WorkShoes(String modelWorkShoes, String workShoesSize, WorkShoesType workShoesType) {
        this.modelWorkShoes = modelWorkShoes;
        this.workShoesSize = Integer.parseInt(workShoesSize);
        this.workShoesType = workShoesType;
        this.workShoesStatus = NOT_ISSUE;
    }
}
