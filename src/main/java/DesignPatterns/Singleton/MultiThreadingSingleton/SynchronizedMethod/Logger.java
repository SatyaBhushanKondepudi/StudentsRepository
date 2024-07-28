package DesignPatterns.Singleton.MultiThreadingSingleton.DoubleLockSingleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Logger {
    private static Logger instance ;
    private static Lock lock = new ReentrantLock();
    private Logger(){}
    public Logger getInstance(){
        if(instance == null) {
            lock.lock();
            if(instance == null){
                instance = new Logger();
            }
            lock.unlock();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("Logged : " + message);
    }
}
