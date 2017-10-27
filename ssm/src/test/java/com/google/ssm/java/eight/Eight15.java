package com.google.ssm.java.eight;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Eight15 {

    public static void main(String[] args) {
//        int dayOfYear = LocalDate.now().getMonthValue();
//        System.out.println(dayOfYear);
//        String path = "E:\\06_Temp\\files\\1\\2017\\10";
//        File file = new File(path);
//        if(!file.exists()){
//            file.mkdirs();
//        }
        String a = "\\static\\upload\\1\\2017\\10/1 _ 副本 _ 副本.jpg";
//        String s = a.replaceAll("\\\\", "/");
//        System.out.println(s);
        List<String> list = new ArrayList<>();
        list.add(a);
        List<String> collect = list.stream().map(e -> {
            String s = e.replaceAll("\\\\", "/");
            return s;
        }).collect(Collectors.toList());
        System.out.println(collect.get(0));
    }
}
