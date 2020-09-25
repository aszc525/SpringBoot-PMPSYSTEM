package com.zhouwudi.pmpsystem.Controller;

import com.zhouwudi.pmpsystem.Mapper.UserMapper;
import com.zhouwudi.pmpsystem.Model.User;
import com.zhouwudi.pmpsystem.Service.UserService;
import com.zhouwudi.pmpsystem.Service.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/Userlogin")
    public String Userlogin(User user, HttpServletRequest request, HttpServletResponse response){
    String l=user.toString();
        System.out.printf(l);//前端获取的user：id password数据
        int flag=userService.UserLogin(user);//执行这一步的时候，执行了SQL，user被填的数据库的数据
        response.setContentType("text/html;charset=utf-8");
        request.getSession().setAttribute("user",user);
        if(flag==1) {
            request.getSession().setAttribute("USER_SESSION", user);
        }else{//账户或密码错误，存值到前端页面，用js判断并给予提示
            request.setAttribute("username",user.getId());
            request.setAttribute("password",user.getPassword());
            return "login";
        }
      return "index";
    }
}
