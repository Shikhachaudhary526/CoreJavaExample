package StreamAPI;

 interface Animal{
     void show();
     static void display() {
         System.out.println("Static method");
     }
     default void harilal() {
         System.out.println("Harilal");
     }
}

public class FunctionalInterfaceExample {// NO error. aise hi check kia jata hai. Kudh ka mind use karo or kya question banta hai
     //Jo hai usko complegte karo.ook  or method ko call karao
    public static void main(String[] args){
//        FunctionalInterfaceExample object = new FunctionalInterfaceExample();
//        object.show();
        Animal animal = ()-> System.out.println("Hi");//Yahi purpose hai. ok//dekha? 1 se jayada pe usne error mar dia.yes yaha error nahi aai
        animal.show();
        animal.harilal();

        Animal.display();
    }
}
