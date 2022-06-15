package sanjiv.dp.singleton.multithread;

/*
 * This class is example for creating the Singleton class.
 * This is the example of the Lazy initialization. Lazy initialization means instance will be created on demand.
 * This example will work in Multithreaded Environment but only one thread will be able to work at a time, so it will be slow.
 * */

public class MultThreadSingletonSyncMethod {
    private static MultThreadSingletonSyncMethod instance = null;

    /*
     * private constructor so that no one can create the object from out-side
     * */
    private MultThreadSingletonSyncMethod(){}

    public static synchronized MultThreadSingletonSyncMethod getInstance() {
        if(instance == null){
            instance = new MultThreadSingletonSyncMethod();
        }
        return instance;
    }
}
