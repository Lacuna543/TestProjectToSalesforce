package knyryk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {
    public static List<Integer> fibonacciCalculation(int n) { //calculation number to given N
        List<Integer> fibSequence = new ArrayList<>();

        if (n == 0) {
            return fibSequence;
        }
        fibSequence.add(1);
        int current = 2;

        for (int i = 3; current <= n; i++) {
            fibSequence.add(current);
            current = fibSequence.get(i - 2) + fibSequence.get(i - 3);
        }

        return fibSequence;
    }

    public static String reworkLines(List<String> origin) { //filter, reverse file
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
