package exercise;

import com.sun.org.apache.xpath.internal.functions.FuncStringLength;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.nio.channels.AsynchronousByteChannel;

/**
 * Created by Administrator on 13-7-25.
 */
public class Stringtest {
    //作字符串类 实例或者直接去变量赋值的时候
    public static void main(String[] args) {
        String a1=null;
        String a2="直接赋";
        String a3=new String();
        String a4=new String("ABC");
        String a5=new String(a2); //构造或者赋值的本质,就是给字符串的类一个字符串,可以用最简单方法直接给他,也可以用它其他的域 构造方法里也可以进行方法。

        System.out.println("a1:"+a1);
//        System.out.println(b);
//        System.out.println( omparableTo(a1 a2));

        String name="COOLTOOLS";
        System.out.println(name.lastIndexOf(2,3));

    }
//      static String a2="null";
//      static int a=a2.length();
//      static char b=a2.charAt(3);
//      char[] chars=new char[10];
//      static char[]charss=a2.getChars(2,2,char[] chars,a);






}
