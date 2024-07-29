package DesignPatterns.Singleton.MultiThreadingSingleton.EnumBasedSingleton;

public class LoggerThread extends Thread{
    @Override
    public void run(){
//        Logger logger = Logger.getInstance();
//        logger.log("Message from thread " + Thread.currentThread().getName());
        Loggers loggers = Loggers.Instance ;
        Loggers.log("Message from thread " + Thread.currentThread().getName());
    }
}
