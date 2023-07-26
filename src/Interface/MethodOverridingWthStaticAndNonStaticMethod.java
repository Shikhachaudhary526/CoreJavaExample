package Interface;

class ParentA{
    public static void staticMethod(){
        System.out.println("Parent class static method");
    }
    public void nonStaticMethod(){
        System.out.println("Parent class non static method");
    }
}
class ChildA extends ParentA{
    public static void staticMethod(){
        System.out.println("Child class static method");
    }
    public void nonStaticMethod(){
        System.out.println("Child class non static method");
    }
}
public class MethodOverridingWthStaticAndNonStaticMethod {
    public static void main(String[] args){
        ParentA parentARef = new ChildA();
        ParentA parentAObj = new ParentA();

        parentARef.nonStaticMethod(); // it will give child class non-static method because non-static can be overridden
        parentARef.staticMethod();  // it will give parent class static method because static method cannot be overridden

        parentAObj.nonStaticMethod(); // it will give Parent class non-static method because non-static can be overridden
        parentAObj.staticMethod(); // it will give Parent class static method.

    }
}
