package DesignPatterns.Singleton.MultiThreadingSingleton.DoubleLockSingleton;

public class Client {
    public static void main(String[] args) {
        for(int i=0 ; i<5 ; i++){
            LoggerThread loggerThread = new LoggerThread();
            loggerThread.start();
        }

    }
}
