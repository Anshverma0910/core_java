package serealization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serial
{
    public static void serial(Student obj){
        try {
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Object has been Serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
