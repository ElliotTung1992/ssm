package com.google.ssm.java.eight;

import java.util.stream.IntStream;

public class Eight6 {

    public static void main(String[] args) {
        for (int i = 7; i > 0; i --){
            System.out.println(i);
        }

        IntStream.iterate(7, i -> i -1).limit(7).forEach(p -> System.out.println(p));
    }
}
