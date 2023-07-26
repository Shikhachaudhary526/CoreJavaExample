package association;

class Furniture{
    public void table(){
        System.out.println("This is a table");
    }
    public void chair(){
        System.out.println("This is a chair");
    }
}

public class HasARelationshipExample {
    public static void main(String[] args){
        Furniture furniture = new Furniture();
        furniture.table();
        furniture.chair();
    }

}
