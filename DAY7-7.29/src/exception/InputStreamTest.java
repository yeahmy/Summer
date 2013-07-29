package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.*;

/**
 * Created by Administrator on 13-7-29.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream=new FileInputStream( new File("c:/java.txt"));
            byte[] b=new byte[3];
//            int=inputStream.read(byte[] b);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        }
    }
}
