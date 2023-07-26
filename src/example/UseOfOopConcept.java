package example;

//
class Base {
    {
        System.out.println("Init block");
    }
    public final String address = "UP";
    public static void run(){
        System.out.println("Static method is running");
    }
    static {
        System.out.println("Static block is running");
    }
    //Constructor Chaining
    public Base(){
        this(10,20);
        System.out.println("parent class Default Constructor");
    }
    public Base(int x, int y){
        System.out.println("Parent class Parameterized constructor");
    }

    //Encapsulation
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //MethodOverloading
    public int sum(int a, int b){
        return a+b;
    }
    public void sum(int a){
        System.out.println("Number is::: " +a);
    }

}
public class UseOfOopConcept extends Base {
    public UseOfOopConcept(){
        this("Shikha","Pushkar");
        System.out.println("Child class Default constructor");
    }
    public UseOfOopConcept(String str1, String str2){
        super();
        System.out.println("Child class parameterized constructor");
    }
    public static void main(String[] args){
        UseOfOopConcept object = new UseOfOopConcept();
        object.setName("Shikha");
        object.setAge(23);
        System.out.println("Name is :::: " +object.getName());
        System.out.println("Age is ::: " +object.getAge());
        object.sum(10);
        //System.out.println(object.sum(10,20));
        Base.run();
        String address1 = object.address;
        System.out.println("Final variable ::::" +address1);
    }
        }

