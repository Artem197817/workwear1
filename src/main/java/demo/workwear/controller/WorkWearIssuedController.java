package demo.workwear.controller;

import demo.workwear.model.WorkWearIssued;
import demo.workwear.servise.WorkWearIssuedService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/work_wear_issued")
@Data
public class WorkWearIssuedController {

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
    public String saveWorkWearIssued(@RequestBody WorkWearIssued workWearIssued) {
        System.out.println(workWearIssued);
        return workWearIssuedService.saveWorkWearIssued(workWearIssued);
    }

    @PutMapping("update_work_wear_issued")
    public String updateWorkWearIssued(@RequestBody WorkWearIssued workWearIssued) {
        return workWearIssuedService.updateWorkWearIssued(workWearIssued);
    }

    @DeleteMapping("delete_work_wear_issued")
    public void deleteWorkWearIssued(@PathVariable Long id) {
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
