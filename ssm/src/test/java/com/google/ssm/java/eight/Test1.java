package com.google.ssm.java.eight;

public class Test1 {

    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        if((i>++i)&(i++ ==j)){
            System.out.println(i + " " + j);
            i += j;
        }
        System.out.println(i + " " + j);
    }
}
