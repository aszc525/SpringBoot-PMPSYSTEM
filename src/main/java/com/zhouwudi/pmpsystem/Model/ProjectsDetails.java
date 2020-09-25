package com.zhouwudi.pmpsystem.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectsDetails {
    private String proId;
    private String proName;
    private String proBoss;
    private String FinishValue;
    private String xyCbValue;
    private String invesValue;
    private String proInves;
    private String proIncome;
    private Date startTime;
    private Date endTime;
    private Date prepayDate;
}
