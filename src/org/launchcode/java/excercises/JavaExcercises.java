package org.launchcode.java.excercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by stephen on 3/2/17.
 */
public class JavaExcercises {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("String", "ABC");
        map.put("Other", "123");
        map.put("Thing", "Hi");

        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static int sumOfEvenArrayElements(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fiveLetterWords(List<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    public static void printList(int[] numbers) {
        for(int i : numbers) {
            System.out.print(i + ", ");
        }
    }

}
