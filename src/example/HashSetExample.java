package example;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);

        System.out.println(hs.size());
    }
}
