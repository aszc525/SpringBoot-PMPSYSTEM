package com.zhouwudi.pmpsystem.Service;

import com.zhouwudi.pmpsystem.Mapper.EmpMapper;
import com.zhouwudi.pmpsystem.Model.Employee;
import com.zhouwudi.pmpsystem.Model.ProjectsDetails;
import com.zhouwudi.pmpsystem.Util.DataMap;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public DataMap queryEmpList(Employee employee) {
        JSONObject returnJson = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject;
        List<Employee> EmpList=empMapper.queryEmpList(employee);
        for (Employee em : EmpList){
            jsonObject = new JSONObject();
            jsonObject.put("empId",em.getEmpId());
            jsonObject.put("empName",em.getEmpName());
            jsonObject.put("DeptName",em.getDeptName());
            jsonObject.put("ProNums",em.getJoinProNums());
            jsonArray.add(jsonObject);
        }

        returnJson.put("dataList",jsonArray);
        return DataMap.success().setData(returnJson);
    }

    @Override
    public DataMap queryProjectDetails(ProjectsDetails projectsDetails) {
        JSONObject returnJson = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject;
        List<ProjectsDetails> details=empMapper.queryProjectDetails(projectsDetails);
        for (ProjectsDetails em : details){
            jsonObject = new JSONObject();
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");//2020/9/16 月份为MM，mm是minter分钟
            jsonObject.put("proName",em.getProName());
            jsonObject.put("finishValue",em.getFinishValue());
            jsonObject.put("startTimes",format.format(em.getStartTime()));
            jsonObject.put("proIncome",em.getProInves());
            jsonObject.put("proInves", em.getProIncome());
            jsonArray.add(jsonObject);
        }
        returnJson.put("dataList",jsonArray);
        return DataMap.success().setData(returnJson);
    }

    @Override
    public List<ProjectsDetails> getProjectInfo() {
        return this.empMapper.getProjectInfo();
    }
}
