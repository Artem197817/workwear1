package demo.workwear.model.modelEnum;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum WorkShoesType {

    CLOGS("Сабо"),
    BOOTS("Ботинки/Сапоги"),
    HALF_BOOTS("Полуботинки"),
    WINTER_SHOES("Обувь зимняя"),
    OTHER("Другое");

    @JsonValue
    private final String value;

    WorkShoesType(String value) {
        this.value = value;
    }
}
