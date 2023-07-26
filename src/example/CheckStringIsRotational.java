package example;

public class CheckStringIsRotational {

        public static boolean isRotation(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }

            String concatenated = s1 + s1;
            return concatenated.contains(s2);
        }

        public static void main(String[] args) {
            String s1 = "ABCD";
            String s2 = "CDBA";

            boolean isRotation = isRotation(s1, s2);
            System.out.println("Is s2 a rotation of s1? " + isRotation);
        }
    }
