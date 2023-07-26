package Interface;

interface Additions{
    public Number addition(Number num1, Number num2);
}
abstract class AbstractAddition implements Additions{
    public String additionOfString(String str1, String str2){
        return str1+str2;
    }
}

class AdditionOfInteger extends AbstractAddition{
    @Override
    public Number addition(Number num1, Number num2) {
        return (Integer) num1 + (Integer) num2;
    }
}
class AdditionOfFloat extends AbstractAddition{

    @Override
    public Number addition(Number num1, Number num2) {
        return (Float) num1 + (Float) num2;
    }
}

public class AbstractClassExample {
    public static void main(String[] args){
        AdditionOfInteger additionOfInteger = new AdditionOfInteger();
        System.out.println("Addition of integer ::: " +additionOfInteger.addition(2,3));

        AdditionOfFloat additionOfFloat = new AdditionOfFloat();
        System.out.println("Addition of float ::: " +additionOfFloat.addition(2.3f, 3.5f));

        System.out.println("String concatenate ::: " +additionOfFloat.additionOfString("Shikha", "Chaudhary"));
    }
}
