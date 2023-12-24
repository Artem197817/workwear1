package demo.workwear.servise;

import demo.workwear.model.WorkShoes;
import demo.workwear.model.modelEnum.WorkShoesType;
import demo.workwear.repository.WorkShoesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class WorkShoesServiceImpl implements WorkShoesService{

   private final WorkShoesRepository workShoesRepository;

    @Override
    public List<WorkShoes> findAllWorkShoes() {
        return workShoesRepository.findAll();
    }

    @Override
    @Transactional
    public void saveWorkShoes(WorkShoes workShoes) {
        workShoesRepository.save(workShoes);
    }

    @Override
    public WorkShoes findById(Long id) {
        Optional<WorkShoes> workShoes = workShoesRepository.findById(id);
        return workShoes.orElse(null);
    }

    @Override
    @Transactional
    public WorkShoes updateWorkShoes(WorkShoes workShoes) {
        return workShoesRepository.save(workShoes);
    }

    @Override
    @Transactional
    public void deleteWorkShoes(Long id) {
    workShoesRepository.deleteById(id);
    }

    @Override
    public List<WorkShoes> findAllWorkShoesByWorkShoesSize(Integer workShoesSize) {
        return workShoesRepository.findAllWorkShoesByWorkShoesSize(workShoesSize);
    }

    @Override
    public List<WorkShoes> findAllWorkShoesByWorkShoesType(WorkShoesType workShoesType) {
        return workShoesRepository.findAllWorkShoesByWorkShoesType(workShoesType);
    }
}
