package com.edu.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfBalloons {

    public int maxNumberOfBalloonsWithHM(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : text.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxCount = 0;
        System.out.println(map);
        maxCount = map.getOrDefault('l', 0) / 2;
        maxCount = Math.min(map.getOrDefault('o', 0) / 2, maxCount);
        maxCount = Math.min(map.getOrDefault('b', 0), maxCount);
        maxCount = Math.min(map.getOrDefault('a', 0), maxCount);
        maxCount = Math.min(map.getOrDefault('n', 0), maxCount);
        return maxCount;
    }

    public int maxNumberOfBalloons(String text) {
        int l = 0;
        int b = 0;
        int a = 0;
        int o = 0;
        int n = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if (c == 'a') {
                a += 1;
            } else if (c == 'b') {
                b += 1;
            } else if (c == 'l') {
                l += 1;
            } else if (c == 'o') {
                o += 1;
            } else if (c == 'n') {
                n += 1;
            }
        }

        l = l / 2;
        o = o / 2;

        return Collections.min(Arrays.stream(new int[]{a, b, l, o, n}).boxed().collect(Collectors.toList()));

    }
}
