package demo.workwear.servise;

import demo.workwear.model.WorkWear;
import demo.workwear.model.WorkWearIssued;
import demo.workwear.repository.WorkWearIssuedRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class WorkWearIssuedServiceImpl implements WorkWearIssuedService {

    private final WorkWearIssuedRepository workWearIssuedRepository;
    private final WorkWearService workWearService;

    @Override
    public List<WorkWearIssued> findAllWorkWearIssued() {
        return workWearIssuedRepository.findAll();
    }

    @Override
    public WorkWearIssued findWorkWearIssuedById(Long id) {
        Optional<WorkWearIssued> workWearIssued = workWearIssuedRepository.findById(id);
        return workWearIssued.orElse(null);
    }

    @Override
    @Transactional
    public String saveWorkShoesIssued(WorkWearIssued workWearIssued) {
        workWearService.findByID(workWearIssued.getWorkWearId()).setWorkWearStatus(WorkWear.ISSUE);
        workWearIssuedRepository.save(workWearIssued);
        return "WorkWearIssued save";
    }

    @Override
    @Transactional
    public String updateWorkShoesIssued(WorkWearIssued workWearIssued) {
        workWearIssuedRepository.save(workWearIssued);
        return "WorkWearIssued update";
    }

    @Override
    public void deleteWorkShoesIssued(Long id) {
        workWearIssuedRepository.deleteById(id);
    }

    @Override
    public List<WorkWearIssued> findWorkWearIssuedByEmployeeId(Long id) {
        return workWearIssuedRepository.findWorkWearIssuedByEmployeeId(id);
    }

    @Override
    public List<WorkWearIssued> findWorkWearIssuedToBeReplaced() {
        LocalDate localDateControl = LocalDate.now().plusMonths(1);
        return workWearIssuedRepository.findAll().stream().
                filter(workWearIssued -> workWearIssued.getReplacementDate().isBefore(localDateControl))
                .toList();
    }
}
