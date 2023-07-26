package example;

//class object passed through method
class Parent{
    public int add(int a, int b){
        return a+b;
    }
    public void sum(Parent obj){
         System.out.println("addition of 2 number::::" +obj.add(2,3));
        System.out.println(obj.method1());
    }

    public void run(MethodCallingByObject object){
        System.out.println("run method");
        object.display(object);
    }

    public MethodCallingByObject method1(){
        return new MethodCallingByObject();
    }
}
public class MethodCallingByObject {
    public void display(MethodCallingByObject object){
        System.out.println("Display");
    }
    public static void main(String[] args){
        Parent obj = new Parent();
        obj.sum(obj);
        MethodCallingByObject object = new MethodCallingByObject();
        object.display(object);
    }
}
