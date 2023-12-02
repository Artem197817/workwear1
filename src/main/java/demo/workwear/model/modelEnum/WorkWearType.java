package demo.workwear.model.modelEnum;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum WorkWearType {

    TECHNOLOGICAL_CLOTHING("Костюм технологический"),
    WORKER_SUIT("Костюм рабочего"),
    WELDER_SUIT("Костюм сварщика"),
    SMOCK("Халат"),
    WINTER_SUIT("Костюм зимний"),
    OTHER("Прочее"),
    SUIT_CLEAN_ROOMS("Костюм чистой комнаты");

    @JsonValue
    private final String value;

    WorkWearType(String value) {
        this.value = value;
    }
}
