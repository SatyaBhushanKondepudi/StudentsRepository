package DesignPatterns.Singleton;

public class DoubleParameteredSingleton {
    private static DoubleParameteredSingleton instance ;
    private static int parameter1 ;
    private static String parameter2 ;
    //constructor
    private DoubleParameteredSingleton(int parameter1 , String parameter2){
        this.parameter1 = parameter1 ;
        this.parameter2 = parameter2 ;
    }
    //GetInstance
    public static DoubleParameteredSingleton getInstance(int parameter1 , String parameter2){
        if(instance == null){
            instance = new DoubleParameteredSingleton(parameter1 , parameter2);
        }
        return instance;
    }

    //SetInstance
    public static DoubleParameteredSingleton setInstance(int parameter1, String parameter2){
        if(instance == null){
            instance = new DoubleParameteredSingleton(parameter1 , parameter2);
        }
        else{
            DoubleParameteredSingleton.parameter1 = parameter1 ;
            DoubleParameteredSingleton.parameter2 = parameter2 ;
        }
        return instance;
    }

    public String print(DoubleParameteredSingleton doubleParameteredSingleton) {
        return "I am using Double Parametered Singleton and the values are as parameter1 : " +
                doubleParameteredSingleton.parameter1 + " parameter 2 : " +
                doubleParameteredSingleton.parameter2 ;
    }
}
