package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.List;

public class Eight7 {

    public static void main(String[] args) {
        //java代码中的传递lambda表达式（pass-through-lambda）并替换为方法引用
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);



//        numbers.stream()
//                .filter(e -> e % 2 == 0)
//                .forEach(e -> System.out.println(e));
//        numbers.stream()
//                .filter(e -> e % 2 ==0)
//                .forEach(System.out::println);
        Eight7 eight7 = new Eight7();
        eight7.test();
    }

    public int addOne(int i){
        return i + 1;
    }

    public int test(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.stream()
//                .map(this::addOne)
//                .forEach(System.out::println);
        numbers.stream()
                .map(e -> this.addOne(e))
                .forEach(System.out::println);
        return 0;
    }

}

