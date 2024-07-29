package DesignPatterns.Singleton;

public class SingleParameteredSingleton {
    private static SingleParameteredSingleton instance ;
    private static String parameter ;
    //Constructor
    private SingleParameteredSingleton(String parameter) {
        this.parameter = parameter ;
    }
    //getInstance
    public static SingleParameteredSingleton getInstance(String parameter) {
        if(instance == null){
            instance = new SingleParameteredSingleton(parameter);
        }
        return instance;
    }
    //setInstance
    public static SingleParameteredSingleton setParameter(String parameter) {
        if(instance == null){
            instance = new SingleParameteredSingleton(parameter);
        }
        else{
            SingleParameteredSingleton.parameter = parameter ;
        }
        return instance;
    }

    //Method
    public String print(SingleParameteredSingleton singleParameteredSingleton) {
        return "I am using Single Parametered Singleton and the value of the parameter is : " +
                singleParameteredSingleton.parameter+ " " ;
    }

}
