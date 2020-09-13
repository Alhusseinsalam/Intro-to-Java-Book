package ch17.binaryio;

import java.io.*;

public class TestBufferIO {
    public static void main(String[] args) {
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("temp.dat"), 500000)
        ) {
            for (int i = 1; i <= 500000000; i++) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("temp.dat"), 500000)) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println(value + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
