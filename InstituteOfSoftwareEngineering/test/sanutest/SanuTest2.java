/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanutest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Sanu
 */
public class SanuTest2 {

    public static void main(String[] args) {
        Date date = new GregorianCalendar(2014, 0, 11).getTime();
       
        Date endDate= new GregorianCalendar(2015, 0, 11).getTime();
        List<Date> daysBetweenDates = getDaysBetweenDates(date, endDate);
        for (Date daysBetweenDate : daysBetweenDates) {
            SimpleDateFormat f= new SimpleDateFormat("d-MMM-yyyy");
            String format = f.format(daysBetweenDate);
            System.out.println("Date "+ format);
        }
    }

    public static List<Date> getDaysBetweenDates(Date startdate, Date enddate) {
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startdate);

        while (calendar.getTime().before(enddate)) {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }
        return dates;
    }

}
