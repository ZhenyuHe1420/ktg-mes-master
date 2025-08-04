package com.ktg.mes.cal.utils;

import com.ktg.mes.cal.domain.CalCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class CalendarUtil {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 仅显示年月日，例如 2015-08-11.
     */
    public static final String DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 获取指定日期字符串.
     * @return String 日期字符串，例如2015-08-11
     */
    public static String getDateStr(Date theday) {
        return format(theday, DATE_PATTERN);
    }

    /**
     * 获取日期时间字符串
     * @param date   需要转化的日期时间
     * @param pattern 时间格式
     * @return String 日期时间字符串，例如 2015-08-11 09:51:53
     */
    public static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 获取指定日期num天数之后的日期.
     * @param date 日期
     * @param num 天数(负数表示之前)
     * @return Date 新的日期
     */
    public static Date addDays(Date date, int num) {
        return add(date, num, Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取当前日期指定数量日期时间单位之后的日期.
     * @param date 日期
     * @param num 数量
     * @param unit 日期时间单位
     * @return Date 新的日期
     */
    public static Date add(Date date, int num, int unit) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(unit, num);
        return calendar.getTime();
    }

    /**
     * 获取本周的第一天，一个星期的第一天是星期一，最后一天是星期天
     * @return Calendar 日历
     */
    public static Date getStartDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取指定日期当周第一天的日期字符串
     * @param date 指定日期
     * @return String 格式：yyyy-MM-dd
     */
    public static String getWeekStartTimeStr(Date date) {
        return getDateStr(getStartDayOfWeek(date));
    }

    /**
     * 获取指定日期所在月份的开始日期
     * @param date
     */
    public static Date getMonthStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int index = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DATE, (1 - index));
        return calendar.getTime();
    }

    /**
     * 获取指定日期所在月份的最后一天
     * @param date
     */
    public static Date getMonthEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        int index = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DATE, (-index));
        return calendar.getTime();
    }

    /**
     * 获取指定日期对应月份第一天
     * @param date
     */
    public static String getMonthStartStr(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int index = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DATE, (1 - index));
        return sdf.format(calendar.getTime());
    }

    /**
     * 获取指定日期对应季度的第一天
     * @param theDay
     */
    public static String getQuarterStartStr(Date theDay){
        LocalDate resDate = null;
        if (theDay == null) {
            resDate  = LocalDate.now();
        }else{
            resDate = LocalDate.parse(sdf.format(theDay),formatter);
        }
        Month month = resDate.getMonth();
        Month firstMonthOfQuarter = month.firstMonthOfQuarter();

        resDate = LocalDate.of(resDate.getYear(), firstMonthOfQuarter, 1);

        return resDate.toString();
    }

    public static Date getNext(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        return calendar.getTime();
    }

    public static Long getDateDiff(Date start,Date end){
        LocalDate sdate = LocalDate.parse(sdf.format(start),formatter);
        LocalDate edate = LocalDate.parse(sdf.format(end),formatter);
        return sdate.until(edate,ChronoUnit.DAYS);
    }

    /**
     * 获取指定月份的所有日期
     * @param d
     */
    public static List<CalCalendar> getDays(Date d){
        List<CalCalendar> lst=new ArrayList();
        Date date = getMonthStart(d);
        Date monthEnd = getMonthEnd(d);
        while (!date.after(monthEnd)) {
            CalCalendar cal = new CalCalendar();
            cal.setTheDay(sdf.format(date));
            lst.add(cal);
            date = getNext(date);
        }
        return lst;
    }
}
