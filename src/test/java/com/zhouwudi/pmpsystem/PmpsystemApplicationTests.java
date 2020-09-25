package com.zhouwudi.pmpsystem;

import com.zhouwudi.pmpsystem.Util.JsonResult;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.*;

@SpringBootTest
class PmpsystemApplicationTests {
    @Test
    public static void main(String[] args) {
        String id= UUID.randomUUID().toString().replace("-","").substring(0,10);
        System.out.printf(id);
        HashMap map=new HashMap();
        map.put("message","success");
        map.put("code","200");
        map.put("data","");
        //正则表达式
        String code="szxc";
        boolean flag=code.matches("^[A-Z]{4}$");
        System.out.printf(flag+"");
        String str="";
        System.out.printf(str.hashCode()+"\n");
        List<Map<String,String>> list=new LinkedList<>();
        HashMap mapR=new HashMap();
        mapR.put("king","jams");
        mapR.put("boy","lemno");
        list.add(mapR);
        System.out.printf(list+"");


    }
    void contextLoads() throws SQLException {

    }

}
