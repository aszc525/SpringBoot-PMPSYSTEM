package com.zhouwudi.pmpsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projects {
    private String proId;
    private String proName;
    private String proBoss;
    private int classNums;
    private float proInves;
    private Date startTime;
    private Date endTime;
    private Date prepayDate;

}
