package demo.workwear.model.modelEnum;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum WorkWearHeight {
    H_158_164("158-164"),
    H_170_176("170-176"),
    H_182_188("182-188"),
    H_194_200("194-200");

    @JsonValue
    private final String value;

    WorkWearHeight(String value) {
        this.value = value;
    }
}
