package example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SolutionOfConcurrentModificationException {
    public static void main(String[] args){
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Mango");
        list.add("Banana");

//        Iterator<String> itr = list.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        for(String fruit : list) {
            list.add("kiwi");
        }
        System.out.println(list);
    }
}
