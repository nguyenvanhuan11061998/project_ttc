package com.ttc.Bai2;

import com.ttc.Bai3.Bill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Sort {
    public List<Integer> sortList(List<Integer> listSo){
        List<Integer> sortList = new ArrayList<>(listSo);
        Collections.sort(sortList);
        return sortList;
    }




}
