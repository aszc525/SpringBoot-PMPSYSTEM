package com.zhouwudi.pmpsystem.Service;

import com.zhouwudi.pmpsystem.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public int UserLogin(User user);
}
