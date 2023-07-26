package ConstructorExample;

// Here we are not making any constructor in parent class. And also we can not make constructor in both parent and child class.
// we are not getting any compile time error because in this case JVM add a magic line in child class default constructor
// which is called Super(). So after running the application, this magic super line will search Parent class default constructor
// if there is no default constructor is available, it will take JVM default constructor and application will run successfully.
class Animal{
    public void display(){
        System.out.println("Parent class method");
    }
}
public class ConstructorWithoutSuper extends Animal{
    public ConstructorWithoutSuper(){
        System.out.println("Child class constructor");
    }
    public void display(){
        System.out.println("Parent class method");
    }

    public static void main(String[] args){
        ConstructorWithoutSuper obj = new ConstructorWithoutSuper();
        obj.display();
    }
}
