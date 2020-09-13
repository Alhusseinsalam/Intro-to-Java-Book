package ch17.binaryio;

import java.io.*;

public class TestDataIOStream {
    public static void main(String[] args) {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));) {
            output.writeUTF("John");
            output.writeDouble(56);
            output.writeUTF("George");
            output.writeDouble(56.2);
            output.writeUTF("Mary");
            output.writeDouble(24);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        ) {
            System.out.println(input.readUTF() + " - " + input.readDouble());
            System.out.println(input.readUTF() + " - " + input.readDouble());
            System.out.println(input.readUTF() + " - " + input.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        ) {
            // detect the end of file
            while (true) {
                System.out.println(input.readUTF() + " - " + input.readDouble());
            }

        } catch (EOFException eofException) {
            System.out.println("All data were read!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
