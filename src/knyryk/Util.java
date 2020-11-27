package knyryk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {
    public static List<Integer> fibonacciCalculation(int n) { //calculation number to given N
        List<Integer> list = new ArrayList<>();

        if (n == 0) {
            return list;
        }

        list.add(1);

        int current = 2;

        for (int i = 3; current <= n; i++) {
            list.add(current);
            current = list.get(i - 2) + list.get(i - 3);
        }

        return list;
    }

    public static String filterAndReverseLines(List<String> origin) { //filter and reverse file
        StringBuilder result = new StringBuilder();
        List<Integer> fib = fibonacciCalculation(origin.size());

        for (int i = 0; i < origin.size(); i++) {
            if (fib.contains(i + 1)){
                result.append(reverseString(origin.get(i))).append(System.lineSeparator());
                }
        }
        return result.toString();
    }

    public static String reverseString(String s) {
        char[] strAsCharArray = s.toCharArray();
        StringBuilder result = new StringBuilder(strAsCharArray.length);

        for (int i = 0; i < strAsCharArray.length; i++) {
            result.append(strAsCharArray[strAsCharArray.length - i - 1]);
        }
        return result.toString();
    }
}
