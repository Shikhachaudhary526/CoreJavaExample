package example;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        for(int i = 0; i<linkedList.size(); i++){
            linkedList.remove(i);
        }

        System.out.println(linkedList.size());
    }
}
