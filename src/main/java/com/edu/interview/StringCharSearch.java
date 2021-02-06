package com.edu.interview;

import com.google.inject.spi.LinkedKeyBinding;

import java.util.*;

public class StringCharSearch {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","S","F"));
        doAction(list);
        StringCharSearch sf = new StringCharSearch();
       /* String str = "my name is granar";
        String finddistance="a";
        System.out.println(sf.searchLetter(str,finddistance));*/
    }
    public int searchLetter(String str, String ch) {
        if(str.length()==0){
            throw new UnsupportedOperationException("searchLetter(String str, String ch)");
        }
        char charInput = ch.charAt(0);
        long count = str.chars().filter(cha -> cha == charInput).count();
        System.out.println(count);
        if (count > 1) {
            int in1 = str.indexOf(charInput) - 1;
            int int2 = str.lastIndexOf(charInput) - 1;
           String subSTR =  str.substring(in1, int2).replace(charInput, ' ').replace(" ", "");
           count = subSTR.chars().distinct().count();
           // Set<Character> unique = new HashSet<>();
           // count = subSTR.chars().//.chars().filter(unique::add).count();
        }else{
            return -1;
        }
        return (int) count;
    }

    public static void doAction(Queue queue){

        Object a = queue.remove();
        if(queue.isEmpty()){ return;}
        //queue.remove();
        doAction(queue);
        System.out.println(a.toString());
    }

}
