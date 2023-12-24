package demo.workwear.servise;

import demo.workwear.model.WorkWearIssued;
import jakarta.validation.constraints.Max;

import java.util.List;

public interface WorkWearIssuedService {

    List<WorkWearIssued> findAllWorkWearIssued();

    WorkWearIssued findWorkWearIssuedById(Long id);

    String saveWorkShoesIssued(WorkWearIssued workWearIssued);

    String updateWorkShoesIssued (WorkWearIssued workWearIssued);

    void deleteWorkShoesIssued (Long id);

    List<WorkWearIssued> findWorkWearIssuedByEmployeeId (Long id);

    List<WorkWearIssued>  findWorkWearIssuedToBeReplaced ();
}
