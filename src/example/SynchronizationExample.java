package example;

class Display {

    public synchronized void greet(String name) {
        for(int i=1; i<6; i++) {
            System.out.println("Good Morning! ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name);
        }
    }
}

class MyThread extends Thread {
    private Display display;
    private String name;
    MyThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }
    public void run() {
        display.greet(name);
    }
}

public class SynchronizationExample{

    public static void main(String[] args) {
        Display display = new Display();
      //  Display display1 = new Display();
        MyThread t1 = new MyThread(display, "Raina");
      //  MyThread t2 = new MyThread(display1, "Virat");
        t1.start();
      //  t2.start();
    }

}

