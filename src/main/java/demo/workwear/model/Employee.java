package demo.workwear.model;


import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Employee {

    @Id
   private int id;
    private String firstName;
    private String lastName;
    private String patronymic;




}
