package com.google.ssm.java.eight;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> origin/master
import java.util.Arrays;
import java.util.List;

public class Eight7 {
<<<<<<< HEAD

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

=======
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");

        List<String> subList = new ArrayList<>();
        for(String name : names) {
            if(name.length() == 4)
                subList.add(name);
        }

        StringBuilder namesOfLength4 = new StringBuilder();
        for(int i = 0; i < subList.size() - 1; i++) {
            namesOfLength4.append(subList.get(i));
            namesOfLength4.append(", ");
        }

        System.out.println(namesOfLength4);

        if(subList.size() > 1)
            namesOfLength4.append(subList.get(subList.size() - 1));

        System.out.println(namesOfLength4);
    }
}
>>>>>>> origin/master
