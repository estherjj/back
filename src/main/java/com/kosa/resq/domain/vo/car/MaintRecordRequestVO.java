package com.kosa.resq.domain.vo.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintRecordRequestVO {

    private String maint_code;

    private String car_code;
    private String maint_item_code;
    private String mc_code;
    private String mem_code;
    private Date maint_start_at;
    private Date maint_end_at;
    private int maint_cost;
    private String pay_method;
    private String memo;
    private int mileage;
}
