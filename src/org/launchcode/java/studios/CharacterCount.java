package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stephen on 3/2/17.
 */
public class CharacterCount {

    public static void main(String[] args) {
//        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.".replaceAll(" ", "");
//        Map<Character, Integer> counts = new HashMap<>();
//        char[] characters = testString.toCharArray();
//
//        for(char c : characters) {
//            if(!counts.containsKey(c)) {
//                counts.put(c, 0);
//            }
//            counts.put(c, counts.get(current) + 1);
//        }
//        printCharacterCounts(counts);

    }

    public static void printCharacterCounts(Map<Character, Integer> counts) {
        for(Character c : counts.keySet()) {
            System.out.println(c + ": " + counts.get(c));
        }
    }
}
