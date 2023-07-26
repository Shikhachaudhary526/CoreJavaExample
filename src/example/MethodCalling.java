package example;

public class MethodCalling {
    public void method1(){
        System.out.println("Method1 is calling");
    }
    public static void method2(){
        System.out.println("Static method2 is calling");
    }
    public static void method3(){
        System.out.println("Static Method3 is calling");
        MethodCalling obj = new MethodCalling();
        obj.method1();
        method2();

    }
    public static void main(String[] args){
        MethodCalling obj = new MethodCalling();
        //obj.method1();
        method3();
    }
}
