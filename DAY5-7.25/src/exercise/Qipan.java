package exercise;


import com.sun.javafx.image.BytePixelSetter;

/**
 * Created by Administrator on 13-7-25.
 */
public class Qipan {
    public static void main(String[] args) {


    int[][] Qipan=new int[14][14];
        for (int i = 0; i < Qipan.length; i++) {
            for (int j = 0; j < Qipan[i].length; j++) {
                Qipan[i][j]=(int)(Math.random()*6+1);

                if (j<Qipan[i].length-1){
                    System.out.print(Qipan[i][j]+" " );
                }else { System.out.println(Qipan[i][j]);}


            }
        }

    }
    }