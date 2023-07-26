package example;

public class StringExample {
    public static void main(String[] args){
        String str = null;
        String str1 = "null";
      //  System.out.println(str.equalsIgnoreCase(str1));  // nullpointerException
        System.out.println(str1.equalsIgnoreCase(str));

    }
}
