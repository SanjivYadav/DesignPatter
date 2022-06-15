package sanjiv.dp.singleton.serialization;

import sanjiv.dp.singleton.serialization.SerializationSingleton;

import java.io.*;

public class SerializationSingletonTest {
    public static void main(String[] args) {
        SerializationSingleton ss = SerializationSingleton.getInstance();
        String fileName = "input.ser";
        try {
            serialize(ss, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        SerializationSingleton ssNew = null;
        try {
            ssNew = (SerializationSingleton) deserialize(fileName);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("ss and ssNew are same :"+ (ss == ssNew));

    }

    // deserialize to Object from given file
    public static Object deserialize(String fileName) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    // serialize the given object and save it to file
    public static void serialize(Object obj, String fileName)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        fos.close();
    }
}

