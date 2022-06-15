package sanjiv.dp.singleton.singlethread;
/*
* This class is example for creating the Singleton class.
* This is the example of the Lazy initialization. Lazy initialization means instance will be created on demand.
* This example will not work in Multithreaded Environment.
* */
public class NormalSingletonLazy {
    private static NormalSingletonLazy instance = null;

    /*
    * private constructor so that no one can create the object from out side
    * */
    private NormalSingletonLazy(){}

    public static NormalSingletonLazy getInstance() {
        if(instance == null){
            instance = new NormalSingletonLazy();
        }return instance;
    }
}
