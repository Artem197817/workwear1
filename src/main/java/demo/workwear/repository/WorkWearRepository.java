package demo.workwear.repository;



import demo.workwear.model.WorkWear;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkWearRepository extends JpaRepository<WorkWear,Long> {

    List<WorkWear> findAllWorkWearByModelWorkWear (String modelWorkWear);

    List<WorkWear> findAllWorkWearByWorkWearType (WorkWearType workWearType);

    List<WorkWear> findAllWorkWearByWorkWearSize (WorkWearSize workWearSize);

}
