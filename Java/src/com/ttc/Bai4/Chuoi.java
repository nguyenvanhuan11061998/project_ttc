package com.ttc.Bai4;

import java.util.*;

public class Chuoi {


//cau1
    public void Chuoi1(String chuoi, char kitu, int n){
        int count = 0;
        int viTriDau = -1;
        int viTriCuoi = -1;
        int viTriPtuThuN = -1;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kitu){
                viTriDau = i;
                break;
            }
        }

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kitu){
                count ++;
                viTriCuoi = i;
                if (count == n){
                    viTriPtuThuN = i;
                }
            }
        }
        if (count == 0){
            System.out.println("chuoi khong chua ptu do");
        }else {
            System.out.println("so ptu chuoi: "+count);
            System.out.println("Vi tri dau: "+viTriDau);
            System.out.println("Vi tri cuoi: "+viTriCuoi);
            if (viTriPtuThuN == -1 ){
                System.out.println("khong chua ptu "+kitu+"thu "+n);
            }else {
                System.out.println("vi tri ptu thu "+n+ " la: "+viTriPtuThuN);
            }
        }
    }

    public void Chuoi1_2(String chuoi, String chuoi1, int n){
        int count = 0;
        int viTriDau = -1;
        int viTriCuoi = -1;
        int viTriPtuThuN = -1;

        viTriDau = chuoi.indexOf(chuoi1);
        viTriCuoi = chuoi.lastIndexOf(chuoi1);

        int dem = 0;

        while (chuoi.contains(chuoi1)){
            count ++;
            int index  =chuoi.indexOf(chuoi1)+chuoi1.length();
            dem = dem + index;
            chuoi = chuoi.substring(index);
            if (count == n){
                viTriPtuThuN = dem - chuoi1.length();
            }
        }

        if (count == 0){
            System.out.println("chuoi khong chua chuoi do");
        }else {
            System.out.println("so lan xuat hien cua chuoi1 trong chuoi: "+count);
            System.out.println("Vi tri dau: "+viTriDau);
            System.out.println("Vi tri cuoi: "+viTriCuoi);
            if (viTriPtuThuN == -1 ){
                System.out.println("khong chua chuoi "+chuoi1+" thu "+n);
            }else {
                System.out.println("vi tri ptu thu "+n+ " la: "+viTriPtuThuN);
            }
        }
    }


//cau2:
    //a. tim ki tu xuat hien nhieu nhat
    public void chuoi2(String chuoi){
        int maxCount= 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chuoi.length(); i++) {
            if (hashMap.containsKey(chuoi.charAt(i))){
                int count = hashMap.get(chuoi.charAt(i));
                count++;
                if (maxCount <= count){
                    maxCount = count;
                }
                hashMap.replace(chuoi.charAt(i),count);
            }else {
                hashMap.put(chuoi.charAt(i),1);
                if (maxCount == 0){
                    maxCount = 1;
                }
            }
        }

        for (Character ptu: hashMap.keySet()) {
            if (hashMap.get(ptu)==maxCount){
                System.out.println(ptu + " - "+ maxCount);
            }
        }
    }


 // b
    private void splitChuoi(int n, HashMap<String, Integer> hashMap, String chuoi){
        for (int i = 0; i < chuoi.length()-n; i++) {
            String chuoi1 = chuoi.substring(i,i+n+1);
            if (hashMap.containsKey(chuoi1)){
                int count = hashMap.get(chuoi1);
                count++;
                hashMap.replace(chuoi1,count);
            }else {
                hashMap.put(chuoi1,1);
            }
        }
    }

    public void chuoi2_2(String chuoi){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chuoi.length(); i++) {
            splitChuoi(i,hashMap,chuoi);
        }

        for (String key : hashMap.keySet()) {
            System.out.println("Key = " + key+ " - Values = "+hashMap.get(key));
        }

        System.out.println(hashMap.size());
    }

    public void chuoi3(List<String> listChuoi){
        String chuoi = "";
        for (String chuoiCon: listChuoi) {
            chuoi =chuoi + chuoiCon + " , ";
        }
        System.out.println(chuoi);
    }

    public void chuoi4(String chuoi){
        String[] arrChuoi = chuoi.split("\\,");
        List<String> listChuoi = new ArrayList<>(Arrays.asList(arrChuoi));

        for (int i = 0; i < listChuoi.size(); i++) {
            System.out.print(" "+listChuoi.get(i));
        }
    }

    public void chuoi5(String raw, String from, String to){
        raw = raw.replace(from, to);
        System.out.println(raw);
    }
}
