package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eight9 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
        String str = names.stream()
                .filter(name -> name.length() == 4)
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }


}
