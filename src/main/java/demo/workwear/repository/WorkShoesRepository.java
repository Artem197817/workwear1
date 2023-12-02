package demo.workwear.repository;

import demo.workwear.model.WorkShoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkShoesRepository extends JpaRepository<WorkShoes,Long> {
}
