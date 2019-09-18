package com.ttc.Bai1;

public class TinhTong {
    public int tinhTong(int n){
        int tong = n*(n+1)/2;
        return tong;
    }

    public int tinhTong2(int n){
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong = tong + n;
        }
        return tong;
    }
}
