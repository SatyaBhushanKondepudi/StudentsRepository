package DesignPatterns.Singleton;

public class ParmeterlessSingleton {
    private static ParmeterlessSingleton instance ;
    //Constructor
    private ParmeterlessSingleton(){}
    //Returning instance
    public static ParmeterlessSingleton getInstance(){
        if(instance == null){
            instance = new ParmeterlessSingleton();
        }
        return instance;
    }
    //No Set Instance

    //A method in this class
    public String print(ParmeterlessSingleton instance){
        return "Hi I am using a Parameterless Singleton instance.";

    }
}
