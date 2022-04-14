package bsw.iron.barcode_server.entity;

import lombok.Data;

@Data
public class LimitDTO {
    private MainGroup mainGroup;
    private MainValue mainValue;
    private Code code;
    private Limit limit;
}
