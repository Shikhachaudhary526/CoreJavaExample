package ConstructorExample;

public class ConstructorChainingWithinSameClass {
    public ConstructorChainingWithinSameClass(){
        this("Shikha");
        System.out.println("Default constructor");
    }
    public ConstructorChainingWithinSameClass(String name){
        this(2,3);
        System.out.println("String name constructor");
    }

    public ConstructorChainingWithinSameClass(int num1, int num2){
       // this(2);
        System.out.println("Parameterized with 2 int value constructor");
    }

    public ConstructorChainingWithinSameClass(int num1){
        System.out.println("Parameterized with 1 int value constructor");
    }

    public static void main(String[] args){
        ConstructorChainingWithinSameClass object = new ConstructorChainingWithinSameClass();
    }

}
