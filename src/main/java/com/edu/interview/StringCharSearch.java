package com.edu.interview;

import java.util.HashSet;
import java.util.Set;

public class StringCharSearch {
    public static void main(String[] args) {
        StringCharSearch sf = new StringCharSearch();
        String str = "my name is granar";
        String finddistance="a";
        System.out.println(sf.searchLetter(str,finddistance));
    }
    public int searchLetter(String str, String ch) {
        char charInput = ch.charAt(0);
        long count = str.chars().filter(cha -> cha == charInput).count();
        if (count > 1) {
            int in1 = str.indexOf(charInput) - 1;
            int int2 = str.lastIndexOf(charInput) - 1;
           String subSTR =  str.substring(in1, int2).replace(charInput, ' ').replace(" ", "");
            Set<Integer> unique = new HashSet<>();
            count = subSTR.chars().filter(unique::add).count();
        }else{
            return -1;
        }
        return (int) count;
    }

}
