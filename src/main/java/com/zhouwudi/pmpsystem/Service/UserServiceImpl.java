package com.zhouwudi.pmpsystem.Service;

import com.zhouwudi.pmpsystem.Mapper.UserMapper;
import com.zhouwudi.pmpsystem.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
   @Autowired
   private  UserMapper userMapper;
    public int UserLogin(User user) {
       int flag=0;
       if(this.userMapper.UserLogin(user)!=null){
           flag=1;
       }
       return flag;
    }
}
