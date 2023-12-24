package demo.workwear.repository;


import demo.workwear.model.WorkShoesIssued;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkShoesIssuedRepository extends JpaRepository<WorkShoesIssued,Long> {

    List<WorkShoesIssued> findWorkShoesIssuedByEmployeeId (Long id);
}
