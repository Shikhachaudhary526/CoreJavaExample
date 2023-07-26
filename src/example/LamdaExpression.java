package example;

@FunctionalInterface
interface Drawable{
    public String method();
}
public class LamdaExpression {
    public static void main(String[] args){

        Drawable object = () ->{

            return "success";
        };
        System.out.println(object.method());
    }
}
