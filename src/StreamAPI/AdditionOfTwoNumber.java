package StreamAPI;

interface Addition{
    int add(int num1, int num2);
}
public class AdditionOfTwoNumber {
    public static void main(String[] args) {
        Addition addition = (num1, num2) -> (num1 + num2);
        System.out.println(addition.add(2,3));
    }
}
