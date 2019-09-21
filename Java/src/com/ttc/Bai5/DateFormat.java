package com.ttc.Bai5;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
        try {
            Date date = format.parse(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            calendar.add(Calendar.DATE,-(calendar.get(Calendar.DATE) - 1));
            String ngayDauThang = format.format(calendar.getTime());

            calendar.add(Calendar.DATE,calendar.getMaximum(Calendar.DATE)-calendar.get(Calendar.DATE));
            String ngayCuoiThang = format.format(calendar.getTime());

            calendar.setTime(date);
            if (calendar.get(Calendar.DAY_OF_WEEK) != 2){
                calendar.add(Calendar.DATE, -(calendar.get(Calendar.DAY_OF_WEEK) - 2));
            }
            String ngayDauTuan = format.format(calendar.getTime());

            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR,100);
            String ngay100 = format.format(calendar.getTime());


            System.out.println("Ngay dau thang: "+ngayDauThang);
            System.out.println("ngay cuoi thang: "+ngayCuoiThang);
            System.out.println("ngay dau tuan: "+ngayDauTuan);
            System.out.println("100 ngay sau: "+ngay100);


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void dateFormat3(String time1, String time2){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = format.parse(time1);
            Date date2 = format.parse(time2);

            if (date1.compareTo(date2) == 0){
                System.out.println("hai ngay bang nhau");
            }else if (date1.compareTo(date2)<0){
                System.out.println("ngay a nho hon ngay b");
            }else {
                System.out.println("ngay a lon hon ngay b");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void formatDate4(String time1, String time2){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = format.parse(time1);
            Date date2 = format.parse(time2);

            Calendar calendar1 = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();

            calendar1.setTime(date1);
            calendar2.setTime(date2);

            LocalDate localDate1 = LocalDate.of(calendar1.get(Calendar.YEAR),calendar1.get(Calendar.MONTH),calendar1.get(Calendar.DAY_OF_MONTH));
            LocalDate localDate2 = LocalDate.of(calendar2.get(Calendar.YEAR),calendar2.get(Calendar.MONTH),calendar2.get(Calendar.DAY_OF_MONTH));

            if (date1.compareTo(date2)<0){
                Period hieuSoNgay = Period.between(localDate1,localDate2);
                System.out.println(" cach nhau: "+hieuSoNgay.getDays()+" ngay, "
                        +hieuSoNgay.getMonths()+" thang, "+hieuSoNgay.getYears()+" nam");
            }else {
                Period hieuSoNgay = Period.between(localDate2,localDate1);
                System.out.println(" cach nhau: "+hieuSoNgay.getDays()+" ngay, "
                        +hieuSoNgay.getMonths()+" thang, "+hieuSoNgay.getYears()+" nam");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void formatDate5(String time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = format.parse(time);
            Timestamp timestamp = new Timestamp(date.getTime());
            System.out.println(timestamp);
        } catch (ParseException e) {

        }
    }

    public void formatDate6(String time1, String time2){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat format1 = new SimpleDateFormat("ss");
        SimpleDateFormat format2 = new SimpleDateFormat("mm:ss");
        try {
            Date date1 = format.parse(time1);
            Date date2 = format.parse(time2);

            Timestamp timestamp1 = new Timestamp(date1.getTime());
            Timestamp timestamp2 = new Timestamp(date2.getTime());

            long time = (timestamp1.getTime() - timestamp2.getTime())/1000;
            System.out.println("giay: "+time);

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.SECOND,(int)time%60);
            String time3 = format1.format(calendar.getTime());
            System.out.println("phut - giay: "+time/60+":"+time3);

            calendar =  Calendar.getInstance();
            calendar.set(Calendar.MINUTE,(int)time%3600);
            String time4 = format2.format(calendar.getTime());
            System.out.println("Gio - phut - giay: "+time/3600+":"+time4);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void formatDate7(String time){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format3 = new SimpleDateFormat("MMM yyyy,dd HH:mm:ss");

        try {
            Date date = format1.parse(time);
            String date1 = format2.format(date);
            String date2 = format3.format(date);
            System.out.println(date1);
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
