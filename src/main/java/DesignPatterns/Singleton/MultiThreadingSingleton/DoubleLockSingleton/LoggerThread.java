package DesignPatterns.Singleton.MultiThreadingSingleton.DoubleLockSingleton;

public class LoggerThread extends Thread{
    @Override
    public void run(){
        Logger logger = Logger.getInstance();
        logger.log("Message from thread " + Thread.currentThread().getName());
    }
}
