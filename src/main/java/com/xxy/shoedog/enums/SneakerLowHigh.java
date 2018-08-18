package com.xxy.shoedog.enums;

import lombok.Getter;

/**
 * @author X
 * @package com.xxy.shoedog.enums
 * @date 8/18/2018 4:34 AM
 */
@Getter
public enum SneakerLowHigh {
    LOW(1, "低帮"),
    HIGH(2, "高帮"),
    ;

    private Integer code;
    private String type;

    SneakerLowHigh(Integer code, String type) {
        this.code = code;
        this.type = type;
    }
}
