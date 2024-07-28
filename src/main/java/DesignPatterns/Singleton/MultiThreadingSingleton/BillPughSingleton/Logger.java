package DesignPatterns.MultiThreadingSingleton.BillPughSingleton;

public class Logger {
//    private static Logger instance ;
//    private static final Lock lock = new ReentrantLock();
    private Logger(){
        System.out.println("Logger instance created : " + this.hashCode());
    }
    private static class SingletonHelper{
        private static Logger instance = new Logger();
    }

    public static Logger getInstance(){
        return SingletonHelper.instance ;
    }
//    public static Logger getInstance(){
//        if(instance == null){
//            lock.lock();
//            if(instance == null){
//                instance = new Logger();
//            }
//            lock.unlock();
//        }
//        return instance ;
//    }
    public void log(String message){
        System.out.println("Logged : " + message);
    }
}
