package test;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-26.
 */
public class Chararray {
    public static void main(String[] args) {
//        String s1="Hello!" ;
//        char[]s11=s1.toCharArray();
//        System.out.println(s11);
//
//        char[] s22={'H','e','l','l','o','!'};
//        String s3=String.valueOf(s22, 0, 6);
//        System.out.println(s3);
//
//     //ToUpperCase
//        String s0="Hello";
//        char[] s00=s0.toCharArray();
//        for(int i=0;i<s00.length;i++){
//            if(s00[i]>97){
//                s00[i]=(char)(s00[i]-32);
//
//            }
//        }
//        String s000=String.valueOf(s00, 0, 5);
//        System.out.println(s000);


        System.out.println(m("五五五hihiHHHHa"));

     //ToUpperCase2     可输入字符串






    }
    private static String m(String mm){
        String s0=mm;
        char[] s00=s0.toCharArray();
        int i;
        for( i=0;i<s00.length;i++){
            if(s00[i]>=97&&s00[i]<=122){
                s00[i]=(char)(s00[i]-32);

            }
        }
        String s000=String.valueOf(s00, 0,i );
         return s000;

    }
}
