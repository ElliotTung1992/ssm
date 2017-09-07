package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.List;

public class Eight1 {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Pite", "Merry");
        imperative(names);
        declaration(names);
    }

    //声明式
    private static void declaration(List<String> names) {
        if(names.contains("Mike")){
            System.out.println("find mike");
        }else{
            System.out.println("sorry");
        }
    }

    //命令式格式
    private static void imperative(List<String> names) {
        boolean a = false;
        for (String name:names) {
            if("Mike".equals(name)){
                a = true;
                break;
            }
        }
        if(a){
            System.out.println("find mike");
        }else{
            System.out.println("sorry");
        }
    }

}
