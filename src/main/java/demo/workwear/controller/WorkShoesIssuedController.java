package demo.workwear.controller;

import demo.workwear.model.WorkShoes;
import demo.workwear.model.WorkShoesIssued;
import demo.workwear.servise.WorkShoesIssuedService;
import demo.workwear.servise.WorkShoesService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work_shoes_issued")
@Data
public class WorkShoesIssuedController{

    private final WorkShoesIssuedService workShoesIssuedService;
    private final WorkShoesService workShoesService;

    @GetMapping("work_shoes_issued_all")
    public List<WorkShoesIssued> findAllWorkShoesIssued() {
        return workShoesIssuedService.findAllWorkShoesIssued();
    }

    @PostMapping("save_work_shoes_issued/{workShoesIssued}")
    public String saveWorkShoesIssued (@PathVariable WorkShoesIssued workShoesIssued) {
      workShoesService.findById(workShoesIssued.getWorkShoes()).setWorkShoesStatus(WorkShoes.ISSUE);
      workShoesIssuedService.saveWorkShoesIssued(workShoesIssued);
        return "WorkShoesIssued save";
    }

    @GetMapping("work_shoes_issued_by_id/(id)")
    public WorkShoesIssued findById(@PathVariable Long id) {
        return workShoesIssuedService.findById(id);
    }

   @PutMapping("work_shoes_issued_update/{workShoesIssued}")
    public WorkShoesIssued updateWorkShoesIssued(WorkShoesIssued workShoesIssued) {
        return null;
    }

    @DeleteMapping("delete_work_shoes_issued/{id}")
    public void deleteWorkShoesIssued(Long id) {
        workShoesService.deleteWorkShoes(workShoesService.findById(id).getId());
        workShoesIssuedService.deleteWorkShoesIssued(id);
    }
    @GetMapping("work_shoes_issued_by_id_employee/{id}")
    public List<WorkShoesIssued> findWorkShoesIssuedByEmployeeID(Long id) {
        return workShoesIssuedService.findWorkShoesIssuedByEmployeeID(id);
    }
}
