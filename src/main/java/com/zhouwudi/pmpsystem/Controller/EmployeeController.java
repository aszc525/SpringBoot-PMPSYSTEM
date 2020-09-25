package com.zhouwudi.pmpsystem.Controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhouwudi.pmpsystem.Constant.CodeType;
import com.zhouwudi.pmpsystem.Model.Employee;
import com.zhouwudi.pmpsystem.Model.ProjectsDetails;
import com.zhouwudi.pmpsystem.Service.EmployeeService;
import com.zhouwudi.pmpsystem.Util.DataMap;
import com.zhouwudi.pmpsystem.Util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SimpleFormatter;

@RestController
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

@GetMapping(value = "/getEmployeeList")
public String queryEmpList(Employee employee) {
    try {
        //执行业务获取数据库中数据empMap
        DataMap empMap= employeeService.queryEmpList(employee);
        //Map aa=JsonResult.success("1001",CodeType.SUCCESS_STATUS);
        //System.out.printf(aa+"");
        return JsonResult.build(empMap).toJSON();//使用Json工具类把empMap Json格式化并返回
    } catch (Exception e) {
        log.error("Find employees exception", e);
    }
    return JsonResult.fail(CodeType.SERVER_EXCEPTION).toJSON();
 }

@GetMapping(value="/getProjectDetails")
public String getProjectDetails(ProjectsDetails projectsDetails){
    try {
        DataMap Map = employeeService.queryProjectDetails(projectsDetails);
        return JsonResult.build(Map).toJSON();
    } catch (Exception e) {
        log.error("Find employees exception", e);
    }
    return JsonResult.fail(CodeType.SERVER_EXCEPTION).toJSON();
}
@ResponseBody
@RequestMapping(value = "/getProjectInfo",produces = "html/text;charset=UTF-8")
    public String getProjectInfo(@RequestParam int pageNumber,ProjectsDetails p,
                                 int pageSize, HttpServletResponse response){
    response.setContentType("text/json");
    System.out.println(pageNumber+"===="+pageSize);
    response.setCharacterEncoding("utf-8");
    PageHelper.startPage(pageNumber,pageSize);
    List<ProjectsDetails> projectInfoList = null;
    try {
        projectInfoList = employeeService.getProjectInfo();
    } catch (Exception e) {
       log.error("query projectInfo error!",e);
    }
    JSONObject returnJson=new JSONObject();
    JSONArray jsonArray=new JSONArray();
    for (ProjectsDetails pro : projectInfoList){
         SimpleDateFormat dateFormatter=new SimpleDateFormat("yyyy-MM-dd");
         JSONObject jsonObject=new JSONObject();
         jsonObject.put("proName",pro.getProName());
         jsonObject.put("finishValue",pro.getFinishValue());
         jsonObject.put("startTime",dateFormatter.format(pro.getStartTime()));
         jsonObject.put("proIncome",pro.getProInves());
         jsonObject.put("proInves",pro.getProIncome());
         jsonArray.add(jsonObject);
    }
    PageInfo<ProjectsDetails> page=new PageInfo<>(projectInfoList);
    //获取页数 total
    int total = (int) page.getTotal();
    //取出查询结果,BootStrap js会遍历名为rows的List,作为查询的行数。
    returnJson.put("rows",jsonArray);
    returnJson.put("total",total);
    log.debug("data",returnJson);
    System.out.println(returnJson.toString());
    //转换为json数据返回
    return returnJson.toJSONString();
 }
}
