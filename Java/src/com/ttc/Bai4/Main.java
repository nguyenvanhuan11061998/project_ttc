package com.ttc.Bai4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Chuoi chuoi = new Chuoi();
        chuoi.Chuoi1("fdsjfhshfsdkfhs",'d',3);                            //câu 1
        chuoi.Chuoi1_2("abcdegabfjglabhu","ab",3);                        //câu 1
        chuoi.chuoi2("qwerwewqrwwqerrwwer");                              //câu 2
//        chuoi.chuoi2_2("riut");                                           //câu 2 ý 2: chưa làm được


        List<String> listChuoi = new ArrayList<>();                       //câu 3
        listChuoi.add("Nguyen");
        listChuoi.add("Van");
        listChuoi.add("Huan");
        chuoi.chuoi3(listChuoi);


        chuoi.chuoi4("Nguyen,Van,Huan");                                  //Câu 4

        chuoi.chuoi5("Nguyen Van Huan","Van","Huu");         //Câu 5
    }
}
