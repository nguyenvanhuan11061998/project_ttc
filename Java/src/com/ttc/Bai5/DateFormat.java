package com.ttc.Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

    public void dateFormat1(String time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = format.parse(time);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }



    public void dateFormat2(String time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM");
        try {
            Date date = format.parse(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            String ngayDau  = format1.format(date)+"-"+calendar.getMinimum(Calendar.DATE);
            String ngayCuoi = format1.format(date)+"-"+calendar.getMaximum(Calendar.DATE);
            int ngayDauTuan = calendar.get(Calendar.DAY_OF_WEEK);



            System.out.println(ngayDauTuan);


        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
