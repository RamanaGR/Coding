package com.edu.interview;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("9912333321456"));
        System.out.println(longestPalindrome("madam"));
        System.out.println(longestPalindrome("malayalam"));
        System.out.println(longestPalindrome("mmmmalayalammkhi"));
        System.out.println(longestPalindrome("dacotaatocad"));
    }

    private static String longestPalindrome(String s) {

        if (s == null || s.isEmpty()) {
            return null;
        }

        String longest = s.substring(0, 1);
        for (int i = 0; i < (s.length() - 1); i++) {
            String tmp;
            // get longest palindrome with center of i
            tmp = expandAroundCenter(s, i, i); // oddLength
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            // get longest palindrome with center of i, i+1
            tmp = expandAroundCenter(s, i, i + 1); // evenLength
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right <= s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

  /*  public static String longestPalindrome(String s) {
        if (s.isEmpty())
            return s;

        int start = -1, end = 0;
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (isPalindrome(array, i - end - 1, i)) {
                start = i - end - 1;
                end += 2;
            } else if (isPalindrome(array, i - end, i)) {
                start = i - end;
                end += 1;
            }
        }
        return new String(array, start, end);
    }

    private static boolean isPalindrome(char[] array, int start, int end) {
        while (start < end) {
            if (start < 0 || array[start++] != array[end--])
                return false;
        }
        return true;
    }*/

}
