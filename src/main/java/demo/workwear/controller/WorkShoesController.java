package demo.workwear.controller;


import demo.workwear.model.WorkShoes;
import demo.workwear.model.modelEnum.WorkShoesType;
import demo.workwear.servise.WorkShoesService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/work_shoes")
@Data
public class WorkShoesController {


    private final WorkShoesService workShoesService;

    @GetMapping
    public List<WorkShoes> findAllWorkShoes() {
        return workShoesService.findAllWorkShoes();
    }

    @GetMapping("/{id}")
    public WorkShoes findById(@PathVariable Long id) {
       return workShoesService.findById(id);
    }

    @PostMapping("save_shoes")
    public String saveWorkShoes(@RequestBody WorkShoes workShoes) {
        workShoesService.saveWorkShoes(workShoes);
        return "WorkShoes successfully saved";
    }

    @DeleteMapping("/delete_work_shoes/{id}")
    public void deleteWorkShoes(@PathVariable long id) {
        workShoesService.deleteWorkShoes(id);
    }


    @GetMapping("work_shoes_size/{workShoesSize}")
    public List<WorkShoes> findAllWorkShoesByWorkShoesSize(@PathVariable Integer workShoesSize) {
        return workShoesService.findAllWorkShoesByWorkShoesSize(workShoesSize);
    }

    @GetMapping("work_shoes_type/{workShoesType}")
    public List<WorkShoes> findAllWorkShoesByWorkShoesType(@PathVariable WorkShoesType workShoesType) {
        return workShoesService.findAllWorkShoesByWorkShoesType(workShoesType);
    }
}
