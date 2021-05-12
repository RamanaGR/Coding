package com.edu.interview;

import java.util.*;

public class FindCountOfSubSetInList {

    public void noofsub(List<List<String>> al, String root, String next) {

        List<List<String>> lists = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.get(i).size(); j++) {
                if (root == al.get(i).get(j)) {
                    lists.add(al.get(i));
                    break;
                } else if (next == al.get(i).get(j)) {
                    lists.add(al.get(i));
                    break;

                } else
                    continue;

            }
            next = al.get(i).get(1);
        }
        System.out.println(lists);
        System.out.println("count for above list : each of them are related to other = " + lists.size());
        al.removeAll(lists);
        System.out.println("current remaining list :" + al);

    }


    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<>();

        ls.add(0, Arrays.asList("paul", "sam"));
        ls.add(1, Arrays.asList("sam", "rob"));
        ls.add(2, Arrays.asList("rob", "lee"));
        ls.add(3, Arrays.asList("john", "dan"));
        ls.add(4, Arrays.asList("john", "lilly"));
        ls.add(5, Arrays.asList("David", "paul"));
        FindCountOfSubSetInList obj = new FindCountOfSubSetInList();

// setting root = paul, next = sam and sending list<list<string>>
        for (int i = 0; i < ls.size(); i++) {
            String root = ls.get(i).get(0);
            String next = ls.get(i).get(1);
            obj.noofsub(ls, root, next);
        }

    }

}
