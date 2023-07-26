package example;

class Class1{
    public void method1(Class1 classObject1,Class2 classObject2, Class3 classObject3){
        //classObject2.method2(classObject2);0
        classObject2.method2(classObject2);
        classObject3.method3(classObject3);
        System.out.println("Method1 calling");
    }
}
class Class2{
    public void method2(Class2 classObject2){
        System.out.println("Method2 calling");
    }

    public void callMethod2(Class1 classObject1,Class2 classObject2, Class3 classObject3){
        classObject1.method1(classObject1,classObject2,classObject3);
       // classObject3.method3(classObject3);
        System.out.println(" CallMethod2 calling");
    }
}
class Class3{
    public void method3(Class3 classObject3){
        System.out.println("Method3 calling");
    }
    public void callMethod3(Class1 classObject1,Class2 classObject2, Class3 classObject3){
       // classObject1.method1(classObject1,classObject2,classObject3);
      //  classObject2.method2(classObject2);
        classObject2.callMethod2(classObject1,classObject2,classObject3);
        System.out.println(" CallMethod3 calling");
    }
}
public class MethodCallingByCreatingObject {

    public static void main(String[] args) {
        Class1 classObject1 = new Class1();
        Class2 classObject2 = new Class2();
        Class3 classObject3 = new Class3();
       // classObject1.method1(classObject1,classObject2,classObject3);
      //  classObject2.callMethod2(classObject1,classObject2,classObject3);
        classObject3.callMethod3(classObject1,classObject2,classObject3);
    }
}
