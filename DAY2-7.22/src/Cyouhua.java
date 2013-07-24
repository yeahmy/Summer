import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-7-22.
 */
public class Cyouhua {
    public static void main(String[] args) {
        double a,b,c,d;
        for(a=1;a<=9;a++){
            for(b=0;b<=9;b++){
                for(c=0;c<=9;c++){
                    for(d=0;d<=9;d++){
                        if(Math.pow(d,4)+Math.pow(c,4)+Math.pow(b,4)+Math.pow(a,4)==a*1000+b*100+c*10+d){
                            System.out.println(a*1000+b*100+c*10+d);//?强制类型转换为什么不好用？
                        }
                    }
                }
            }
        }
    }
}
