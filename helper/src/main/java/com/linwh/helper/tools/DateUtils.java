package com.linwh.helper.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * author : linwenhao
 * date   : 2022/5/23 16:26
 * desc   : 时间工具
 * version: 1.0
 */
public class DateUtils {
    /**
     * 获取当前时间
     * @return
     */
    public static String getCurrentTime(){
        Calendar mCalendar=Calendar.getInstance();
        int year=mCalendar.get(Calendar.YEAR);
        int month=mCalendar.get(Calendar.MONTH)+1;
        int day = mCalendar.get(Calendar.DAY_OF_MONTH);
        int hours = mCalendar.get(Calendar.HOUR_OF_DAY);
        int minute = mCalendar.get(Calendar.MINUTE);
        String toString=toString(year)+"_"+toString(month)+"_"+toString(day)+"_"+toString(hours)+"_"+toString(minute);
        return toString;
    }
    private static String toString(int obj){
        return String.valueOf(obj);
    }

    /**
     *
     * @param endDay
     * @return
     */
    public static int getDifferDay(String endDay){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");// HH:mm:ss
        try {
            Date endDate = simpleDateFormat.parse(endDay);
            long startTime = System.currentTimeMillis();
            long endTime = endDate.getTime();
            return  (int) ((endTime - startTime) / (1000 * 60 * 60 * 24));
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
