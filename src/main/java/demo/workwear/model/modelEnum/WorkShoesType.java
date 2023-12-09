package demo.workwear.model.modelEnum;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.Getter;

@Getter
public enum WorkShoesType {

    CLOGS("Сабо"),
    BOOTS("Ботинки/Сапоги"),
    HALF_BOOTS("Полуботинки"),
    WINTER_SHOES("Зимняя обувь"),
    OTHER("Другое");

    @JsonValue
    private final String value;

    WorkShoesType(String value) {
        this.value = value;
    }

}
