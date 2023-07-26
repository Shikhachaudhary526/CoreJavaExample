package Interface;

class Animal{
    public void display(){
        System.out.println("Parent class method");
    }
}

class Cat extends Animal{
    public void display(){
        System.out.println("Child class method");
    }
}

public class MethodOverridingWithNonStaticMethod {
    public static void main(String[] args){
        Animal animal = new Cat();       // if we are not using static method in both parent and child class
                                         // then it will give child class method as an output.
        animal.display();
    }
}
