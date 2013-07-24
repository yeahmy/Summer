import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-7-22.
 */
public class F {
    public static void main(String[] args) {
        int a,b,c;
        for(a=0;a<=20;a++){                        //数学思维可以提前想好大致思路，想先任取2,5的个数，然后定下1的个数，因为2，5很容易取超了确定比较复杂，若1也任取，则范围稍宽一点判断标准一个就行。
            for(b=0;b<=50;b++){                //总结：计算机试数，然后规定标准即可，不需要哪个数是你算出来的。
                for(c=0;c<=100;c++){
                    if(a*5+b*2+c==100){
                        for(int x=1;x<=c;x++){
                            System.out.print("1 ");
                        }
                        for(int y=1;y<=b;y++){
                            System.out.print("2 ");
                        }
                        for(int z=1;z<=a;z++){
                            System.out.print("5 ");
                        }
                        System.out.println('\n');
                    }
                }
            }
        }

    }
}
