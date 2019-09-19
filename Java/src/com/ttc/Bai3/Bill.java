package com.ttc.Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Bill implements Comparable<Bill>{
    private int id;
    private String name;
    private long money;
    private String date;

    public Bill(int id, String name, long money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Bill bill) {
//        if (money == bill.getMoney()){
//            return 0;
//        }else if (money > bill.getMoney()){
//            return 1;
//        }else {
//            return -1;
//        }

        if (formatTime(date) == formatTime(bill.getDate())){
            return 0;
        }else if (formatTime(date).after(formatTime(bill.getDate()))){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bill bill = (Bill) o;
        return id == bill.id &&
                Objects.equals(name, bill.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getMoney() {
        return money;
    }

    public String getDate() {
        return date;
    }

    private Date formatTime(String time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(time);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
