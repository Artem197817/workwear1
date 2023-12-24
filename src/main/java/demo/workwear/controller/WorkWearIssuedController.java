package demo.workwear.controller;

import demo.workwear.model.WorkWearIssued;
import demo.workwear.servise.WorkWearIssuedService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work_wear_issued")
@Data
public abstract class WorkWearIssuedController {

    private final WorkWearIssuedService workWearIssuedService;

    @GetMapping("work_wear_issued_all")
    public List<WorkWearIssued> findAllWorkWearIssued() {
        return workWearIssuedService.findAllWorkWearIssued();
    }

    @GetMapping("work_wear_issued_by_id")
    public WorkWearIssued findWorkWearIssuedById(@PathVariable Long id) {
        return workWearIssuedService.findWorkWearIssuedById(id);
    }

    @PostMapping("save_work_wear_issued")
    public String saveWorkShoesIssued(@PathVariable WorkWearIssued workWearIssued) {
        return workWearIssuedService.saveWorkShoesIssued(workWearIssued);
    }

    @PutMapping("update_work_wear_issued")
    public String updateWorkShoesIssued(@PathVariable WorkWearIssued workWearIssued) {
        return workWearIssuedService.updateWorkShoesIssued(workWearIssued);
    }

    @DeleteMapping("delete_work_wear_issued")
    public void deleteWorkShoesIssued(@PathVariable Long id) {
        workWearIssuedService.deleteWorkShoesIssued(id);
    }

    @GetMapping("work_wear_issued_by_employee_id")
    public List<WorkWearIssued> findWorkWearIssuedByEmployeeId(@PathVariable Long id) {
        return workWearIssuedService.findWorkWearIssuedByEmployeeId(id);
    }

    @GetMapping("work_wear_issued_to_be_replace")
    public List<WorkWearIssued> findWorkWearIssuedToBeReplaced() {
        return workWearIssuedService.findWorkWearIssuedToBeReplaced();
    }
}
