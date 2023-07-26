package StreamAPI;

interface Drawable{
    public String draw(String fName, String lName);
}
public class StringExampleForDoubleParameter {
    public static void main(String[] args){
        Drawable drawable = (fName, lName) -> {return "My first name is " + fName + " and last name is " +lName;};
        System.out.println(drawable.draw("Shikha", "Chaudhary"));
    }
}
