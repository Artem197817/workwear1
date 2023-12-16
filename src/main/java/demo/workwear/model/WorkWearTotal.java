package demo.workwear.model;

import demo.workwear.model.modelEnum.WorkWearHeight;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class WorkWearTotal {

    private final WorkWearType workWearType;
    private final WorkWearSize workWearSize;
    private final WorkWearHeight workWearHeight;
    private int number;

}
