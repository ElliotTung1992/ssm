package com.google.ssm.java.eight;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Eight4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //传统方式
        final int tem = 0;
        for (int i = 0; i < 5; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(tem);
                }
            });
        }
        //range函数
        IntStream.range(0, 5).forEach(p -> {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(p);
                }
            });
        });
        //拉姆达表达式
        IntStream.range(0, 5)
                .forEach(i ->
                        executorService.submit(() -> System.out.println("Running task " + i)));
        IntStream.range(0, 5).forEach(p -> executorService.submit(() -> System.out.println(p)));
        executorService.shutdown();

        IntStream.rangeClosed(0, 5).forEach(p -> System.out.println(p));
    }
}
