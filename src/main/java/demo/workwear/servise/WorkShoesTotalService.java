package demo.workwear.servise;

import demo.workwear.model.WorkShoesTotal;
import demo.workwear.model.modelEnum.WorkShoesType;


import java.util.List;

public interface WorkShoesTotalService {


    List<WorkShoesTotal> findWorkShoesByTypeSortedNumber(WorkShoesType workShoesType);

    List<WorkShoesTotal> findWorkShoesBySizeSortedNumber(Integer size);

    List<WorkShoesTotal> findAllWorkShoesSortedNumber();
}
