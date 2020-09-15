package ch17.binaryio;

import java.io.RandomAccessFile;

public class TestRandomFileAccessExample {
    public static void main(String[] args) {
        try (RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");) {
            inout.setLength(0);

            for (int i = 0; i < 200; i++) {
                inout.writeInt(i);
            }

            System.out.println("Current file length is: " + inout.length());

            // get first number
            inout.seek(0); // move the file pointer to the beginning
            System.out.println("the first number is: " + inout.readInt());

            // get the second number
            inout.seek(1 * 4); // move 4 bytes because that's how long an Int take so moving 4 bytes will take it to the next int
            System.out.println("the second number is: " + inout.readInt());

            // move to the 10th int
            inout.seek(9 * 4);
            System.out.println("the tenth number is: " + inout.readInt());

            // modify the eleventh number
            inout.writeInt(555);

            //append a new number
            inout.seek(inout.length());
            inout.writeInt(999);

            System.out.println("the new length: " + inout.length());

            // get the eleventh element
            inout.seek(10 * 4);
            System.out.println("Eleventh: " + inout.readInt());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
