package StreamAPI;

 interface Sayable {
    public String show(String name);
}

public class StringExampleForSingleParameter{
     public static void main(String[] args){
         Sayable sayable = (name) -> { return "Hello "  +name;};
            System.out.println(sayable.show("Shikha"));
     }
}
