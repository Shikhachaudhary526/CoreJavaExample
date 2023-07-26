package DesignPattern;

class SingletonDesignPatternDemo{

    private static  SingletonDesignPatternDemo singletonDesignPattern;

    private SingletonDesignPatternDemo(){

    }

    public static synchronized SingletonDesignPatternDemo getInstance(){
        if(singletonDesignPattern == null){
            singletonDesignPattern = new SingletonDesignPatternDemo();
        }
        return singletonDesignPattern;
    }
}
public  class SingletonDesignPattern{
    public static void main(String[] args){
        SingletonDesignPatternDemo.getInstance();
    }

}
