package demo.workwear.model.modelEnum;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Company {
    AO_KATOD("АО \"Катод\""),
    OOO_KATOD("ООО \"Катод\""),
    NONE ("NONE");

    @JsonValue
    private final String value;
    Company (String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Company{" +
                "value='" + value + '\'' +
                '}';
    }

    /*

    public Company getType (String value){
        if (value == null) return NONE;
        for (Company c: values() ){
            if (c.value.equalsIgnoreCase(value))
                return c;
        }
        return NONE;
    }

    public String getValue(){
        return value;
    }
*/

}
