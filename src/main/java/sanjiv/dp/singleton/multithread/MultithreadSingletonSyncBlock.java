package sanjiv.dp.singleton.multithread;

/*
 * This class is example for creating the Singleton class.
 * This is the example of the Lazy initialization. Lazy initialization means instance will be created on demand.
 * This example will work in Multithreaded Environment.
 * This will be faster than MultithreadSingletonSyncMethod singleton example.
 * This is example of double check.
 * */
public class MultithreadSingletonSyncBlock {
    private static MultithreadSingletonSyncBlock instance = null;

    /*
     * private constructor so that no one can create the object from out-side
     * */
    private MultithreadSingletonSyncBlock(){}

    public static MultithreadSingletonSyncBlock getInstance() {
        if(instance == null){
            synchronized (MultithreadSingletonSyncBlock.class) {
                if(instance == null) {
                    instance = new MultithreadSingletonSyncBlock();
                }
            }
        }
        return instance;
    }
}
