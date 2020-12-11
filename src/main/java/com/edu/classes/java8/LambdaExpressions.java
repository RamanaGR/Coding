package com.edu.classes.java8;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=0; i<=10; i++) {
            l1.add(i);
        }
        System.out.println(l1);
        List<Integer> l2 = l1.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(l2);
    }

}
