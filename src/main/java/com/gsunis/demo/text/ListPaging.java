package com.gsunis.demo.text;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ListPaging {

    public static List<List<Integer>> paging(List<Integer> list, int pageSize) {
        int totalCount = list.size();
        int pageCount;
        int m = totalCount % pageSize;

        if (m > 0) {
            pageCount = totalCount / pageSize + 1;
        } else {
            pageCount = totalCount / pageSize;
        }

        List<List<Integer>> totalList = new ArrayList<List<Integer>>();
        for (int i = 1; i <= pageCount; i++) {
            if (m == 0) {
                List<Integer> subList = list.subList((i - 1) * pageSize, pageSize * (i));
                totalList.add(subList);
            } else {
                if (i == pageCount) {
                    List<Integer> subList = list.subList((i - 1) * pageSize, totalCount);
                    totalList.add(subList);
                } else {
                    List<Integer> subList = list.subList((i - 1) * pageSize, pageSize * i);
                    totalList.add(subList);
                }
            }
        }

        return totalList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 52; i++) {
            list.add(i);
        }

        List<List<Integer>> totalList = paging(list, 10);
        System.out.println(totalList.get(0));

    }
}