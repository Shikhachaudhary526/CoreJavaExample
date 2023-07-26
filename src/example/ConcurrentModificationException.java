package example;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Orange");
        list.add("Apple");
        for (String str : list){
            System.out.println(str);
            System.out.println("Trying to adding new value :::::: ");
            list.add("Kiwi");
        }
    }
}
