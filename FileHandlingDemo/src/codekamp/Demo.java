package codekamp;

import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by cerebro on 13/07/18.
 */
public class Demo {
    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("src/codekamp/hello.txt");
//            System.out.println((char) reader.read());
//            System.out.println((char) reader.read());
//            System.out.println((char) reader.read());
//
//            BufferedReader b = new BufferedReader(reader);
//            System.out.println(b.readLine());
//            System.out.println(b.readLine());
//            reader.close();

//            FileWriter writer = new FileWriter("src/codekamp/hello.txt");
//            writer.write("Hello World!");
//            writer.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            RandomAccessFile file = new RandomAccessFile("src/codekamp/hello.txt", "rw");
//            System.out.println(file.readLine());
//            System.out.println(file.readLine());
//            file.seek(file.length());
//            file.writeChars("\nHello World!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src/codekamp");

        System.out.println(file.isDirectory());
        System.out.println(file.exists());
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(file.length());

        File[] children = file.listFiles();
        System.out.println(children.length);

        for (int i = 0; i < children.length; i++) {
            File child = children[i];

            System.out.println(child.isDirectory());
            System.out.println(child.getName());
            System.out.println(child.length());
            System.out.println("-----------");
        }

        System.out.println(file.getParentFile().isDirectory());
        System.out.println(file.getParentFile().getName());
    }
}
