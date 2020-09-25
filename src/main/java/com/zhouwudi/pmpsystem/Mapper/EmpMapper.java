package com.zhouwudi.pmpsystem.Mapper;

import com.zhouwudi.pmpsystem.Model.Employee;
import com.zhouwudi.pmpsystem.Model.ProjectsDetails;
import com.zhouwudi.pmpsystem.Util.DataMap;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface EmpMapper {
    List queryEmpList(Employee employee);
    List queryProjectDetails(ProjectsDetails projectsDetails);
    public List<ProjectsDetails> getProjectInfo();
}
