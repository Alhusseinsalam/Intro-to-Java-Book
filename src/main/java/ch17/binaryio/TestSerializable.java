package ch17.binaryio;

import java.io.*;

public class TestSerializable {
    /**
     * Store an array of five ints to a files using Serializable and then read it
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        String[] strings = {"John", "Susan", "Kim"};

        try (ObjectOutputStream outputStream =
                        new ObjectOutputStream(new FileOutputStream("array.dat", true));
                ) {

            outputStream.writeObject(numbers);
            outputStream.writeObject(strings);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream("array.dat"))) {
            int[] newNumbers = (int[]) inputStream.readObject();
            String[] newStrings = (String[]) inputStream.readObject();

            for (int i = 0; i < newNumbers.length; i++) {
                System.out.println(newNumbers[i] + " ");
            }

            for (int i = 0; i < newStrings.length; i++) {
                System.out.println(newStrings[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class C implements Serializable {
    private int v1;
    private static double v2; // won't be serialized because it's static
    private transient A v3 = new A(); // use transient keyword to enable C to be serializable although A is not, A won't be serialized
    // if v3 is not marked "transient" it will throw an exception (NotSerializableException)
}

class A {

}
