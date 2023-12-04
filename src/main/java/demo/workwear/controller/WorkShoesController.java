package demo.workwear.controller;


import demo.workwear.model.WorkShoes;
import demo.workwear.model.modelEnum.WorkShoesType;
import demo.workwear.repository.WorkShoesRepository;
import demo.workwear.servise.WorkShoesService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/work_shoes")
@Data
public class WorkShoesController {

    private final WorkShoesRepository workShoesRepository;
    private final WorkShoesService workShoesService;

    @GetMapping
    public List<WorkShoes> findAllWorkShoes() {
        return workShoesRepository.findAll();
    }

    @GetMapping("/{id}")
    public WorkShoes findById(@PathVariable Long id) {
        Optional<WorkShoes> workShoes = workShoesRepository.findById(id);
        return workShoes.orElse(null);
    }

    @PostMapping("save_work_shoes")
    public String saveWorkShoes(@RequestBody List<WorkShoes> workShoes) {
        workShoes.forEach(workShoesService::saveWorkShoes);
        return "WorkShoes successfully saved";
    }

    @DeleteMapping("/delete_work_shoes/{id}")
    public void deleteWorkShoes(@PathVariable long id) {
        workShoesService.deleteWorkShoes(id);
    }


    @GetMapping("work_shoes_size/{workShoesSize}")
    public List<WorkShoes> findAllWorkShoesByWorkShoesSize(@PathVariable Integer workShoesSize) {
        return workShoesRepository.findAllWorkShoesByWorkShoesSize(workShoesSize);
    }

    @GetMapping("work_shoes_type/{workShoesType}")
    public List<WorkShoes> findAllWorkShoesByWorkShoesType(WorkShoesType workShoesType) {
        return workShoesRepository.findAllWorkShoesByWorkShoesType(workShoesType);
    }
}
