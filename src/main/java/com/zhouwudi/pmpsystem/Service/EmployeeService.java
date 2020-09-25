package com.zhouwudi.pmpsystem.Service;

import com.zhouwudi.pmpsystem.Model.Employee;
import com.zhouwudi.pmpsystem.Model.ProjectsDetails;
import com.zhouwudi.pmpsystem.Util.DataMap;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public DataMap queryEmpList(Employee employee);
    public DataMap queryProjectDetails(ProjectsDetails projectsDetails);
    public List<ProjectsDetails> getProjectInfo();
}
