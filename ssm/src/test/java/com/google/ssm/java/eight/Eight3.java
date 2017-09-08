package com.google.ssm.java.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Eight3 {

    public static List<People> creatPeos(){
        return Arrays.asList(
            new People("fengningning", 25),
            new People("yanliuting", 18),
            new People("fengyong", 45),
            new People("niannina",2)
        );
    }

    public static void main(String[] args) {
        List<People> peoples = creatPeos();
//        List<People> list = new ArrayList<>();
//        for (People p:peoples) {
//            if(p.getAge() > 3){
//                list.add(p);
//            }
//        }
//        Collections.sort(list, new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//                return o1.getAge().compareTo(o2.getAge());
//            }
//        });
        List<String> collect = peoples.stream().filter(p -> p.getAge() > 3).sorted(Comparator.comparing(People::getAge).reversed()).map(People::getName).collect(toList());
        collect.forEach(p -> System.out.println(p));
    }
}
