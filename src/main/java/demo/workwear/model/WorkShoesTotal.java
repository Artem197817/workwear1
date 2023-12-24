package demo.workwear.model;

import demo.workwear.model.modelEnum.WorkShoesType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkShoesTotal {

    private WorkShoesType workShoesType;
    private Integer workShoesSize;
    private Integer number;

}
