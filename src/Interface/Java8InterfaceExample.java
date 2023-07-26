package Interface;


//but ye kaise functional interface hua ??...qki mai ek hi abstract method rakh rhi hu isiliye???Jake defination padho ...vo muje
// pata hai ki FI ek hi abstract method but yaha mai defaul. Ye quesion q bana rahi  ho ? baana hi nahi chahiye.
//Agar default or static method se farak padta toh usko bola jata ki funcatinal interface ke lye default and satic bhi nahi hona chahiye
//Or ye maine tumhe kafi bar bataya same. Bss tum dekh aaj rahi ho qki kabhi pratical naih kia..ok
interface Parent22 {
    public default void display() {
        System.out.println("Default method");
    }

    public static void show() {
        System.out.println("Static method");
    }

    public abstract void play();
    void shikha();
}
    public class Java8InterfaceExample implements Parent22{

        @Override
        public void play() {
           System.out.println("Play method");
        }

        @Override
        public void shikha() {
            System.out.println("pagal");
        }

        public static void main(String[] args) {
        Java8InterfaceExample object = new Java8InterfaceExample();
        object.play();
        object.shikha();
        object.display();
        Parent22.show();
    }
    }
