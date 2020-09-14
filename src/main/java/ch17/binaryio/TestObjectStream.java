package ch17.binaryio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectStream {
    public static void main(String[] args) {
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
                ) {
            output.writeUTF("John");
            output.writeDouble(55.6);
            output.writeObject(new Date());

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
                ) {
            String name = input.readUTF();
            double age = input.readDouble();
            Date date = (Date) input.readObject();
            System.out.println(name + " - " + age + " - " + date);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
