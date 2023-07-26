package example;

public class ReverseStringExample {
    public static void main(String[] args) {
        String s1 = "Shikha chaudhary";
        /*
         * for(int i = s1.length()-1; i>=0; i--) { System.out.print(s1.charAt(i));
         * //System.out.print(s1); }
         */

        String[] token = s1.split(" "); // used split method to print in reverse orderss
        for (int i = token.length - 1; i >= 0; i--) {
            System.out.print(token[i] + " ");

        }

    }
}
