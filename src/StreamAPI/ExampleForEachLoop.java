package StreamAPI;


import java.util.ArrayList;
import java.util.List;

public class ExampleForEachLoop {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Kiwi");

        list.forEach((number) -> System.out.println(number));
    }
}
