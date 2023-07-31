package constructorExample;
// when we write only parameterized constructor in parent class and 1 default constructor in child class
// then we have to add super() by ourself otherwise we will get compile time error.
 class Parent {

     //constructor1
     public Parent(){
         this(" ");
         System.out.println("non parameterized constructor of parent class");
     }
    //constructor2
    public Parent(String name){
        System.out.println("Parent class Parameterized constructor");
    }
}

public class ConstructorWithSuper extends Parent{

     //constructor3
     public ConstructorWithSuper(){
         this(4);
         System.out.println("non parameterized constructor of child class");
     }

    public ConstructorWithSuper(int val){
        System.out.println("parameterized constructor of child class with int value");
    }

    //constructor4
     public ConstructorWithSuper(String name){
         super("test");
         System.out.println("Child constructor parameterized");
     }

     public static void main(String[] args){
         Parent obj = new ConstructorWithSuper();
     }
}
