package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
//        demoParameterlessSingleton();
//        demoSingleParameteredSingleton();
        demoDoubleParameteredSingleton();
    }

    private static void demoDoubleParameteredSingleton() {
        SingleParameteredSingleton singleParameteredSingleton =
                SingleParameteredSingleton.getInstance("India");
        System.out.println(singleParameteredSingleton);
        System.out.println(singleParameteredSingleton.print(singleParameteredSingleton));

        SingleParameteredSingleton singleParameteredSingleton1 =
                SingleParameteredSingleton.setParameter("America");
        System.out.println(singleParameteredSingleton1);
        System.out.println(singleParameteredSingleton.print(singleParameteredSingleton));

    }

    private static void demoSingleParameteredSingleton() {
        DoubleParameteredSingleton doubleParameteredSingleton1 =
                DoubleParameteredSingleton.getInstance(100 , "Mangos");
        System.out.println(doubleParameteredSingleton1);
        System.out.println(doubleParameteredSingleton1.print(doubleParameteredSingleton1));
        DoubleParameteredSingleton doubleParameteredSingleton2  = DoubleParameteredSingleton.setInstance(1000  , "Oninons");
        System.out.println(doubleParameteredSingleton2);
        System.out.println(doubleParameteredSingleton2.print(doubleParameteredSingleton2));
        System.out.println("Debug");
    }

    public static void demoParameterlessSingleton(){
        ParmeterlessSingleton parmeterlessSingleton = ParmeterlessSingleton.getInstance();
        System.out.println(parmeterlessSingleton.print(parmeterlessSingleton));
    }
}
