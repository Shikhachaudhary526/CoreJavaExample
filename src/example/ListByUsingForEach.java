package example;

import java.util.ArrayList;
import java.util.List;

public class ListByUsingForEach {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Kavita");
        list.add("savita");
        System.out.println(list);
      /*  for(String str : list){
          System.out.println(str);
        }*/
        list.forEach(i->{
            System.out.print(i +  " ");
        });
    }
}
