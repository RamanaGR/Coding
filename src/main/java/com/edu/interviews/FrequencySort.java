package com.edu.interviews;

import org.checkerframework.checker.units.qual.K;
import org.testng.Assert;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FrequencySort {
    public static void main(String[] args) {
        System.out.println(FrequencySort.frequencySort("tomorrow"));
    /*    String str1 = new String("abc");
        String str2 = new String("abc");
        Assert.assertNotSame(str1, str2);*/
    List<String> sr = new ArrayList<>();
    sr.add("adfg");
        sr.add("ad");
        sr.add("gty");
    Iterator itr = sr.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
        sr.add("sdfg");
    }
    }

    //Return string sorted by frequency of characters
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        int len = s.length();
        /*
        Traverse a string,
        store each character and it's count in a map
        */
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

        }
        System.out.println(charCountMap);
        HashMap<Character, Integer> sortedmap = sortByValue(charCountMap);
        System.out.println(sortedmap);
        String s1 = "";
        for (Map.Entry<Character, Integer> entry : sortedmap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                s1 = s1 + entry.getKey();
            }
        }
        return s1;
        /*
        Sort this map by frequency.
        */
        /*  charCountMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(record -> {
                    Character key = record.getKey();
                    int value = record.getValue();
        //Append the character by the number of times it occurrs.
                    for (int i = 0; i < value; i++) {
                        sb.append(key);
                    }
                });
        return sb.toString();*/
    }

    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer>> list =
                new LinkedList<Map.Entry<Character, Integer>>(hm.entrySet());

        // Sort the list
        // list.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
