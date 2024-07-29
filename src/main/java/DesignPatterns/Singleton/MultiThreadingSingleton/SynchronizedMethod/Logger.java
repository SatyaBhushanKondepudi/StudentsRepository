package DesignPatterns.Singleton.MultiThreadingSingleton.SynchronizedMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Logger {
    private static Logger instance ;
    private Logger(){}
    public synchronized static Logger getInstance(){
            if(instance == null){
                instance = new Logger();
            }
        return instance;
    }

    public void log(String message){
        System.out.println("Logged : " + message);
    }
}
