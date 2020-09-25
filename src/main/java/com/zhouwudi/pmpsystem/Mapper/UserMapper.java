package com.zhouwudi.pmpsystem.Mapper;

import com.zhouwudi.pmpsystem.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    public User UserLogin(User user);
}
