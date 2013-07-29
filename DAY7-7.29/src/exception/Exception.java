package exception;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 13-7-29.
 */
public class Exception {
    public static void main(String[] args) {
        String s="HELLO";

        try {
            System.out.println(s.charAt(7));
        }catch (StringIndexOutOfBoundsException e){

        }
        finally {
            System.out.println("hello!!" );
        }
        System.out.println('a');
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile("","");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
