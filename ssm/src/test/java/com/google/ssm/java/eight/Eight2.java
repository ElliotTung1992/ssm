package com.google.ssm.java.eight;

import java.util.HashMap;
import java.util.Map;

public class Eight2 {

    public static void main(String[] args) {
        Map<String, Integer> pageVisits = new HashMap<>();
        String page = "https://agiledeveloper.com";
        pageVisits.put(page, 5);
        incrementPageVisit(pageVisits, page);
        incrementPageVisit(pageVisits, page);
        System.out.println(pageVisits.get(page));
    }

    //imperative
    private static void incrementPageVisit(Map<String, Integer> pageVisits, String page) {
//        if(!pageVisits.containsKey(page)){
//            pageVisits.put(page, 0);
//        }
//        pageVisits.put(page, pageVisits.get(page) + 1);
        pageVisits.merge(page, 1, (oldValue, value) -> oldValue + value);
    }


}
