package ch17.binaryio;

import java.io.*;

public class CopyFile {
    /** Main method
     * @param 'args[0]' for sourceFile
     * @param 'args[1]' for targetFile
     */

    CopyFile() {}

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java copy sourceFile targetFile");
            System.exit(1);
        }

        // check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source File " + args[0] + " does not exist");
            System.exit(2);
        }

        // check if target file exists
        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target File " + args[1] + " does not exist");
            System.exit(2);
        }

        try (
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
                )
        {
            int r, numberOfBytesCoped = 0;
            while ((r = input.read()) != -1) {
                output.write(r);
                numberOfBytesCoped++;
            }
            System.out.println(numberOfBytesCoped + " bytes copied");
            System.out.println(numberOfBytesCoped/1000 + " Kilobytes copied");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
