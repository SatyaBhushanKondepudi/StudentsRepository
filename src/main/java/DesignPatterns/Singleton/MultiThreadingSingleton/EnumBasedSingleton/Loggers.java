package DesignPatterns.Singleton.MultiThreadingSingleton.EnumBasedSingleton;

public enum Loggers {
    Instance;

    public static void log(String s) {
        System.out.println("Logged : " + s);
    }
}
