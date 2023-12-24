package demo.workwear.servise;

import demo.workwear.model.WorkShoes;
import demo.workwear.model.modelEnum.WorkShoesType;

import java.util.List;

public interface WorkShoesService {

    List<WorkShoes> findAllWorkShoes();

    void saveWorkShoes(WorkShoes workShoes);

    WorkShoes findById(Long id);

    WorkShoes updateWorkShoes(WorkShoes workShoes);

    void deleteWorkShoes(Long id);

    List<WorkShoes> findAllWorkShoesByWorkShoesSize (Integer workShoesSize);

    List<WorkShoes> findAllWorkShoesByWorkShoesType (WorkShoesType workShoesType);
}
