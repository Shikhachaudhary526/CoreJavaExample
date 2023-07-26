package example;

public class MethodOverloading {
    public void num(int num1){
        System.out.println("Number is ::::" +num1);
    }
    public float num(float num1){
        return num1;
    }
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        //obj.num(1);
        System.out.println(obj.num(2f));
    }
}
