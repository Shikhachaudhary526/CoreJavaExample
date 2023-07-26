package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapByUsingForEach {
    public static void main(String[] args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Apple");
        hashMap.put(2,"Banana");
        hashMap.put(3,"Orange");
        hashMap.put(4,"Mango");
        System.out.println(hashMap);
        //By using iterator
       /* Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            int key = (int) iterator.next();
            System.out.println("Key::" + key +"    " +"Value::" + hashMap.get(key));
        }*/
        for(Map.Entry<Integer,String> entry : hashMap.entrySet())
            System.out.println("Key ::: " + entry.getKey() + " Value ::: " + entry.getValue());

        //By using foreach loop
      //  hashMap.forEach((k,v) -> System.out.println("Key ::" +k + "  " +"Value ::" +v));
    }
}
