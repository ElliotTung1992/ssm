package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eight8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");

        String s = names.stream().filter(p -> p.length() == 4).collect(Collectors.joining(", "));
        System.out.println(s);
    }
}
