package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Eight11 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        LinkedList<Integer> collect = numbers.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
        LinkedList<Integer> collect = numbers.stream().collect(Collectors.toCollection(LinkedList::new));
        collect.stream().forEach(System.out::println);
    }
}
