package Interface;

class Parent {
    public static void test() {
        System.out.println("test");
    }
}
class Child extends Parent {
        public static void test(){
            System.out.println("child class test");
        }
}
public class MethodHiding {
    public static void main(String[] args){
        Parent parent = new Child();

        parent.test(); // if we are using static method in both parent and child class
                      // then it will give Parent class method as an output.
        Child.test();
    }
}
