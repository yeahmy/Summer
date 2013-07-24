import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Administrator on 13-7-23.
 */
/*
输出[1, 20]随机正整数100000次

        1，2，。。。，20

        java.util.Random
        java.lang.Math

        比较两种方法的效率和随机分布情况[Hashtable]
*/
public class E {
     public static void main(String[] args) {

        Random random=new Random();
        for(int i=0;i<100000;i++){
        System.out.println(random.nextInt(20)+1);

        }
        System.out.println("---------------");

        for(int j=0;j<100000;j++){
        System.out.println((int)(Math.random()*20+1));
        }

    }



}
