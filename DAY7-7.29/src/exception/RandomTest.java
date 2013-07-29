package exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.lang.*;

/**
 * Created by Administrator on 13-7-29.
 */
public class RandomTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile f=new RandomAccessFile("java.txt","rw");
            double b;
//            for (int i = 0; i <10 ; i++)
//                f.readDouble();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
