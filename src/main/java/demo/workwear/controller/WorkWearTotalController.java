package demo.workwear.controller;


import demo.workwear.model.WorkWearTotal;
import demo.workwear.model.modelEnum.WorkWearSize;
import demo.workwear.model.modelEnum.WorkWearType;
import demo.workwear.servise.WorkWearTotalService;
import demo.workwear.servise.WorkWearTotalServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/work_wear_total")
@Data
@AllArgsConstructor
public class WorkWearTotalController {

    WorkWearTotalService workWearTotalService;

    @GetMapping("/work_wear_total_type/{workWearType}")
    public List<WorkWearTotal> findWorkWearByTypeSortedNumber(@PathVariable WorkWearType workWearType){
        return workWearTotalService.findWorkWearByTypeSortedNumber(workWearType);
    }
    @GetMapping("/work_wear_total_size/{workWearSize}")
    public List<WorkWearTotal> findWorkWearBySizeSortedNumber(@PathVariable WorkWearSize workWearSize){
        return workWearTotalService.findWorkWearBySizeSortedNumber(workWearSize);
    }

    @GetMapping("/work_wear_total_all")
    public List<WorkWearTotal>  findAllWorkWearSortedNumber() {
        return workWearTotalService.findAllWorkWearSortedNumber();
    }
}
