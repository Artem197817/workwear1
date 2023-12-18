package demo.workwear.servise;

import demo.workwear.model.WorkShoesIssued;
import demo.workwear.repository.WorkShoesIssuedRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class WorkShoesIssuedServiceImpl implements WorkShoesIssuedService {

    WorkShoesIssuedRepository workShoesIssuedRepository;

    @Override
    public List<WorkShoesIssued> findAllWorkShoesIssued (){
     return workShoesIssuedRepository.findAll();
    }

    @Override
    @Transactional
    public WorkShoesIssued saveWorkShoesIssued(WorkShoesIssued workShoesIssued) {
        return workShoesIssuedRepository.save(workShoesIssued);
    }

    @Override
    public WorkShoesIssued findById(Long id) {
        Optional<WorkShoesIssued> workShoesIssued = workShoesIssuedRepository.findById(id);
        return workShoesIssued.orElse(null);
    }

    @Override
    @Transactional
    public WorkShoesIssued updateWorkShoesIssued(WorkShoesIssued workShoesIssued) {
        return workShoesIssuedRepository.save(workShoesIssued);
    }

    @Override
    public void deleteWorkShoesIssued(Long id) {
        workShoesIssuedRepository.deleteById(id);
    }


    @Override
    public List<WorkShoesIssued> findWorkShoesIssuedByEmployeeID(Long id) {
        return workShoesIssuedRepository.findWorkShoesIssuedByEmployeeID(id);
    }
}
