package demo.workwear.repository;

import demo.workwear.model.WorkShoes;
import demo.workwear.model.modelEnum.WorkShoesType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkShoesRepository extends JpaRepository<WorkShoes,Long> {

    List<WorkShoes> findAllWorkShoesByWorkShoesSize (Integer workShoesSize);

    List<WorkShoes> findAllWorkShoesByWorkShoesType (WorkShoesType workShoesType);
}
