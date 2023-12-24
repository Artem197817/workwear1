package demo.workwear.servise;

import demo.workwear.model.WorkWear;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;

import java.util.List;

public interface WorkWearService {

    List<WorkWear> findAllWorkWear();

    void saveWorkWear(WorkWear workWear);

    WorkWear findByID(Long id);

    WorkWear updateWorkWear(WorkWear workWear);

    void deleteWorkWear(Long id);

    public List<WorkWear> saveAllWorkWear(List<WorkWear> workWearList);

    List<WorkWear> findAllWorkWearByModelWorkWear(String modelWorkWear);

    List<WorkWear> findAllWorkWearByWorkWearType(WorkWearType workWearType);

    List<WorkWear> findAllWorkWearByWorkWearSize(WorkWearSize workWearSize);
}
