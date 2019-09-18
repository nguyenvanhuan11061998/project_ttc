package com.ttc.Bai4;

public class Chuoi {

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
}
