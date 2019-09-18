package com.ttc.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public List<Integer> sortList(List<Integer> listSo){
        List<Integer> sortList = new ArrayList<>(listSo);
        Collections.sort(sortList);
        return sortList;
    }
}
