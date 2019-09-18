package com.ttc.Bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Sort sort = new Sort();
        List<Integer> list = new ArrayList<>(Arrays.asList(2,5,43,7,9,6,4,6,8,4));
        sort.sortList(list).forEach(e -> System.out.println(e));
    }
}
