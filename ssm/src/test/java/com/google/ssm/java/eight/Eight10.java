package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.List;

public class Eight10 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.stream()
//                .filter(p -> p % 2 == 0)
//                .forEach(p -> System.out.println(p));
//        numbers.stream()
//                .filter(p -> p % 2 == 0)
//                .forEach(System.out::println);
        Eight10 eight10 = new Eight10();
//        eight10.test();
        eight10.test2();
    }

    public int increment(int number) {
        return number + 1;
    }

    public void test(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
//                .map(p -> this.increment(p))
                .map(this::increment)
                .forEach(System.out::println);
    }

    public void test2(){
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        numbers.stream()
//                .map(p -> Integer.valueOf(p))
//                .map(String::toUpperCase)
                .map(Integer::parseInt)
                .map(this::increment)
                .forEach(System.out::println);
    }
}
