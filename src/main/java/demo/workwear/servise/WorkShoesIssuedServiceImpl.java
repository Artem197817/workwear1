package demo.workwear.servise;

import demo.workwear.model.WorkShoes;
import demo.workwear.model.WorkShoesIssued;
import demo.workwear.repository.WorkShoesIssuedRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class WorkShoesIssuedServiceImpl implements WorkShoesIssuedService {

    private final WorkShoesIssuedRepository workShoesIssuedRepository;
    private final WorkShoesService workShoesService;

    @Override
    public List<WorkShoesIssued> findAllWorkShoesIssued() {
        return workShoesIssuedRepository.findAll();
    }

    @Override
    @Transactional
    public void saveWorkShoesIssued(WorkShoesIssued workShoesIssued) {
        workShoesService.findById(workShoesIssued.getWorkShoes()).setWorkShoesStatus(WorkShoes.ISSUE);
        workShoesIssuedRepository.save(workShoesIssued);
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
        workShoesService.deleteWorkShoes(workShoesService.findById(id).getId());
        workShoesIssuedRepository.deleteById(id);
    }

    @Override
    public List<WorkShoesIssued> findWorkShoesIssuedByEmployeeID(Long id) {
        return workShoesIssuedRepository.findWorkShoesIssuedByEmployeeId(id);
    }

    @Override
    public List<WorkShoesIssued> findWorkShoesToBeReplaced() {
        LocalDate localDateControl = LocalDate.now().plusMonths(1);
        return workShoesIssuedRepository.findAll().stream().
                filter(workWearIssued -> workWearIssued.getReplacementDate().isBefore(localDateControl))
                .toList();
    }
}
