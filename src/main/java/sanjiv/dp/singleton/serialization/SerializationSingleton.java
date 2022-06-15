package sanjiv.dp.singleton.serialization;

/*
 * This class is example for creating the Singleton class if it is implementing Serializable interface.
 * If class implementing Serializable interface does not have readResolve() method, will not be singleton so
 * we will have to implement readResolve() method in every such classes to make it singleton as it will be used while de-serialization process.
 * */

import java.io.Serializable;
import java.sql.SQLOutput;

public class SerializationSingleton implements Serializable {
    private static SerializationSingleton instance = null;

    /*
     * private constructor so that no one can create the object from out-side
     * */
    private SerializationSingleton(){}

    public static SerializationSingleton getInstance() {
        if(instance == null){
            synchronized (SerializationSingleton.class) {
                if(instance == null) {
                    instance = new SerializationSingleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
