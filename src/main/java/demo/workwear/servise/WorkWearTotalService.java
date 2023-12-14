package demo.workwear.servise;

import demo.workwear.model.WorkWear;
import demo.workwear.model.WorkWearTotal;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;

import java.util.List;

public interface WorkWearTotalService{

    List<WorkWearTotal> findWorkWearByTypeSortedNumber (WorkWearType workWearType);

    List<WorkWearTotal> findWorkWearBySizeSortedNumber (WorkWearSize workWearSize);

    List<WorkWearTotal> findAllWorkWearSortedNumber ();

}
