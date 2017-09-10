package com.google.ssm.java.eight;

import java.util.stream.IntStream;

public class Eight5 {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 100; i = i + 3){
            total += i;
        }
        System.out.println(total);

        int sum = IntStream.iterate(0, i -> i + 3).limit(34).sum();
        System.out.println(sum);

        IntStream.iterate(0, i -> i + 3);
    }
}
