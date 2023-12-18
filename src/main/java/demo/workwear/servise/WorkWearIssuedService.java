package demo.workwear.servise;

import demo.workwear.model.WorkWearIssued;

import java.util.List;

public interface WorkWearIssuedService {

    List<WorkWearIssued> findWorkWearIssuedByEmployeeId (Long id);
}
