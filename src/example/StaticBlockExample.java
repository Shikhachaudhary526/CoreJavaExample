package example;

public class StaticBlockExample {
    static int var;
    public static void display(){
        System.out.println("This is display method");
    }
    static {
         var = 10;
    }
    public static void main(String[] args){
        StaticBlockExample.display();
        System.out.println(StaticBlockExample.var);
    }
}
