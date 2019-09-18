package com.ttc.Bai3;

import java.util.*;

public class ListBill {
    public void ngayLapHD(List<Bill> listBill){

        List<String> listDay = new ArrayList<>();
        for (Bill bill: listBill) {
            listDay.add(bill.getDate());
        }
        listDay.forEach(e -> System.out.println(e));
    }

    public void listBillMoney(List<Bill> listBill){

        List<Bill> listBillMoney = new ArrayList<>();
        for (Bill bill: listBill) {
            if (bill.getMoney() > 1000000){
                listBillMoney.add(bill);
            }
        }
        listBillMoney.forEach(b -> System.out.println(b.getId() +" "+b.getName() +" "+b.getMoney()+" "+b.getDate()));
    }

    private boolean dayExit(String day, HashMap<String, List<Bill>> hashMap){
        for (String key: hashMap.keySet()) {
            if (key.equals(day)){
                return true;
            }
        }
        return false;
    }

    public HashMap<String, List<Bill>> hashMapBin(List<Bill> listBill){
        HashMap<String, List<Bill>> hashMap = new HashMap<>();
        for (Bill b :listBill) {
            if (dayExit(b.getDate(),hashMap)){

            }else {
                List<Bill> list = new ArrayList<>();
                for (Bill bill: listBill) {
                    if (bill.getDate().equals(b.getDate())){
                        list.add(bill);
                    }
                }

                hashMap.put(b.getDate(),list);
            }

        }

        System.out.println(hashMap.size());
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

    public Set<Bill> setBill(List<Bill> listBill, int id, String name){
        Set<Bill> setBill = new HashSet<>();
        for (Bill bill : listBill) {
            if (bill.getId() == id && bill.getName().equals(name)){
                setBill.add(bill);
            }
        }
        System.out.println(setBill.size());
        return setBill;
    }
}
