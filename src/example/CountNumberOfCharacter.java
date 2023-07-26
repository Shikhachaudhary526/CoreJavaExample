package example;

import java.util.HashMap;

public class CountNumberOfCharacter {
    public static void main(String[] args) {
        String str = "ShikhahahahaS";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            for (int j=0; j<str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            hashMap.put(str.charAt(i),count);
            //System.out.println( str.charAt(i) +  " Number of Character:: " + count);
        }
        System.out.println(hashMap);
    }

}
