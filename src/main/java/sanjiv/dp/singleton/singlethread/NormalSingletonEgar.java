package sanjiv.dp.singleton.singlethread;

/*
 * This class is example for creating the Singleton class.
 * This is the example of the Egar initialization. Egar initialization means instance will be created while loading the
 * class itself. Here in this case we can not handle exceptions.
 * This example will not work in Multithreaded Environment.
 * */
public class NormalSingletonEgar {
    private static NormalSingletonEgar instance = new NormalSingletonEgar();

    /*
     * private constructor so that no one can create the object from out side
     * */
    private NormalSingletonEgar(){};

    public static NormalSingletonEgar getInstance() {
        return instance;
    }
}
