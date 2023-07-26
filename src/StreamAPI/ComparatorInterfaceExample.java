package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class ComparatorInterfaceExample {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"HP",75000));
        list.add(new Product(2,"Dell",85000));
        list.add(new Product(3,"Lenovo",50000));

        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

    }
}
