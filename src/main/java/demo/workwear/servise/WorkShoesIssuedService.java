package demo.workwear.servise;


import demo.workwear.model.WorkShoesIssued;

import java.util.List;

public interface WorkShoesIssuedService {

    List<WorkShoesIssued> findAllWorkShoesIssued();

    void saveWorkShoesIssued(WorkShoesIssued workShoesIssued);

    WorkShoesIssued findById(Long id);

    WorkShoesIssued updateWorkShoesIssued(WorkShoesIssued workShoesIssued);

    void deleteWorkShoesIssued(Long id);

    List<WorkShoesIssued> findWorkShoesIssuedByEmployeeID(Long id);

    List<WorkShoesIssued> findWorkShoesToBeReplaced();
}
