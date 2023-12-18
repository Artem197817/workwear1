package demo.workwear.repository;


import demo.workwear.model.WorkWearIssued;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkWearIssuedRepository extends JpaRepository<WorkWearIssued,Long> {

    List<WorkWearIssued> findWorkWearIssuedByEmployeeId (Long id);
}
