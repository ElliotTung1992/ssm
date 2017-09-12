package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.List;

public class Eight13 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3");
        String reduce = numbers.stream()
//                .reduce("", (p, e) -> p.concat(e));
                    .reduce("", String::concat);
        System.out.println(reduce);
    }
}
