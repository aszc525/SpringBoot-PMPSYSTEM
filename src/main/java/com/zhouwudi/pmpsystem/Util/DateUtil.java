package com.zhouwudi.pmpsystem.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 * @author ZhouChao
 * Descrbe: 时间工具
 */
public class DateUtil {
    /** 通用格式
     * 时间格式 yyyy MM dd
     * 2020-09-30
     */
    public String DataFomart(String timeStr){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");//需要改动格式改这个就行了
        Date date=null;
        try {
            //parse 把字符串解析成时间
            date=format.parse(timeStr);
            //format 把时间解析成字符串
            String timeStr1=format.format(date);
            return  timeStr1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // String timeStr1=format.format(date);
        return null;
    }
    /**
     *  英语式时间格式  dd MMM yy
     *  30 Sep 20
     */
    public String DataTrsEn(String timeStr){
        String timeStr1=timeStr;
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format1=new SimpleDateFormat("dd MMM yy", Locale.ENGLISH);
        Date date= null;
        try {
            //parse String转换成date
            date = format.parse(timeStr1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String InterNationalTime=format1.format(date);
      return InterNationalTime;
    }
}
