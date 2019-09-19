package com.ttc.Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Bill> arrBill = new ArrayList<>();
        arrBill.add(new Bill(001,"Nguyen Van Huan",3000000,"1998-12-24"));
        arrBill.add(new Bill(001,"Nguyen Van Huan",3000000,"1998-12-24"));
        arrBill.add(new Bill(002,"Nguyen Van Huan1",1000000,"1998-12-24"));
        arrBill.add(new Bill(003,"Nguyen Van Huan2",4000000,"1996-11-24"));
        arrBill.add(new Bill(004,"Nguyen Van Huan3",2000000,"1996-12-24"));


        // 3: sắp xếp theo thứ tự tăng dần money
        Collections.sort(arrBill);
        for (Bill b: arrBill) {
            System.out.println(b.getId() +" "+b.getName() +" "+b.getMoney()+" "+b.getDate());
        }



        ListBill listBill = new ListBill();
//        listBill.ngayLapHD(arrBill);              //distinct ngày lập hóa đơn
//        listBill.listBillMoney(arrBill);          // list Bill có money > 1000000
//        listBill.hashMapBin(arrBill);             //hashMap Bill
//        listBill.listBill7(arrBill);              //Cau 7
//        listBill.setBill(arrBill);
//        listBill.sortBill(arrBill);
    }
}
