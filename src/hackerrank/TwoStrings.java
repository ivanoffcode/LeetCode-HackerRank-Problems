package hackerrank;

import java.util.*;

public class TwoStrings {

    public static void main(String[] args) {
        int num = 2;
        String str1 = "hello";
        String str2 = "world";
        System.out.println(TwoStrings(str1, str2));
    }

    public static String TwoStrings(String str1, String str2) {
        Set<Character> asd = new HashSet<>();
        for (Character character : str1.toCharArray()) {
            asd.add(character);
        }

        for (Character character : str2.toCharArray()) {
            if (asd.contains(character)) {
                return "YES";
            }
        }

        return "NO";

    }
}
