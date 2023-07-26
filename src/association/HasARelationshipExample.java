package association;

class Furniture{
    public void table(){
        System.out.println("It's a luxury car");
    }
}

public class HasARelationshipExample {
    public static void main(String[] args){
        Furniture car = new Furniture();
        car.table();
    }

}
