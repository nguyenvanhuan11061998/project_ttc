package com.ttc.Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ListBill {



 // câu 5
    public void listBillMoney(List<Bill> listBill){

        List<Bill> listBillMoney = new ArrayList<>();
        for (Bill bill: listBill) {
            if (bill.getMoney() > 1000000){
                listBillMoney.add(bill);
            }
        }
        listBillMoney.forEach(b -> System.out.println(b.getId() +" "+b.getName() +" "+b.getMoney()+" "+b.getDate()));
    }


//distinct ngày lập hóa đơn

    public void ngayLapHD(List<Bill> listBill) {
        HashSet<String> setDay = new HashSet<>();           //Hashset: trả về tập không chứa các phần tử trùng lặp

        for (Bill bill : listBill) {
            setDay.add(bill.getDate());
        }
        setDay.forEach(e -> System.out.println(e));
    }


//Câu 6
    public HashMap<String, List<Bill>> hashMapBin(List<Bill> listBill){
        
        HashMap<String, List<Bill>> hashMap = new HashMap<>();

        for (Bill b :listBill) {
            if (hashMap.containsKey(b.getDate())){
                hashMap.get(b.getDate()).add(b);
            }else {
                List<Bill> list = new ArrayList<>();
                list.add(b);
                hashMap.put(b.getDate(),list);
            }
        }
        return hashMap;

    }

    public List<List<Bill>> listBill7(List<Bill> listBill){

        List<List<Bill>> listBills = new ArrayList<>();
        HashMap<String, List<Bill>> hashMap = hashMapBin(listBill);
        for (List<Bill> list : hashMap.values()) {
            listBills.add(list);
        }

        System.out.println(listBills.size());
        return listBills;
    }

    public Set<Bill> setBill(List<Bill> listBill){
        Set<Bill> setBill = new HashSet<>(listBill);

        System.out.println(setBill.size());
        return setBill;
    }





}
