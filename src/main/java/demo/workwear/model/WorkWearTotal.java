package demo.workwear.model;

import demo.workwear.model.modelEnum.WorkWearHeight;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkWearTotal {

    private  WorkWearType workWearType;
    private WorkWearSize workWearSize;
    private  WorkWearHeight workWearHeight;
    private int number;


}
