package Interface;

public interface Addition {
    public Number addition(Number num1, Number num2);

    class AdditionOfInteger implements Addition{

        @Override
        public Number addition(Number num1, Number num2) {
            return (Integer)num1 + (Integer)num2;
        }
    }
    class AdditionOfFloat implements Addition{

        @Override
        public Number addition(Number num1, Number num2) {
            return (Float) num1+ (Float) num2;
        }
    }
    public static void main(String[] args){
        AdditionOfInteger additionOfInteger = new AdditionOfInteger();
        AdditionOfFloat additionOfFloat = new AdditionOfFloat();

        System.out.println("sum of Integer value :::: " +additionOfInteger.addition(2,5));
        System.out.println("sum of float value ::::: " +additionOfFloat.addition(2.5f,4.6f));

    }
}
