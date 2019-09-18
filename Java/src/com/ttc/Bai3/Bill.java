package com.ttc.Bai3;

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
        if (money == bill.getMoney()){
            return 0;
        }else if (money > bill.getMoney()){
            return 1;
        }else {
            return -1;
        }
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
}
