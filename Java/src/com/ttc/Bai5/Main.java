package com.ttc.Bai5;

public class Main {
    public static void main(String[] args) {
        DateFormat dateFormat = new DateFormat();

        dateFormat.dateFormat1("2011-01-18 10:30:30");
        dateFormat.dateFormat2("2019-07-12");
        dateFormat.dateFormat3("2019-12-11","2019-12-10");
        dateFormat.formatDate4("2019-12-11","2018-12-10");
        dateFormat.formatDate5("2011-01-18 10:30:30");
        dateFormat.formatDate6("2019/12/11 12:20:10","2018/12/10 12:18:01");
        dateFormat.formatDate7("2011/01/18 10:30:30");
    }
}
