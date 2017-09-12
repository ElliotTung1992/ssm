package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.List;

public class Eight12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = numbers.stream()
//                .reduce(0, (total, e) -> total - e);
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
