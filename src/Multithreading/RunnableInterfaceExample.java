package Multithreading;

public class RunnableInterfaceExample {//implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Runnable Interface run method");
//    }

    public static void main(String[] args){

        Runnable runnable = () -> System.out.println("Runnable interface");
        Thread thread = new Thread(runnable);
        thread.start(); //abhi sahi hai??? yes....cheating nahi kiya hai khud se mind mein aaya /// ho gaya. Nahi hua.Run method ko direct call nahi kia jata. Thread ke object ko dia

//        RunnableInterfaceExample runnableInterfaceExample = new RunnableInterfaceExample();
//        Thread thread = new Thread(runnableInterfaceExample);
//        thread.start();
        //Lamda bana ke usse print karao SOP. Bina dekhe. ok
        // to run method kaise milega?Lamda se..lambda le liye bhi toh interface chahiye na aur abstraxt method bhi
        //yahi to point hai. interface ki jarurat nahi hai. Direct use kia jayega uskookkkkk
    }
}
