import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-7-23.
 */
/*随机输出[1000,3000]内的年份
        并判定其是否为闰年(leap year)

        闰年：	西元年份除以400余数为0的，或者除以4为余数0且除以100不为余数0的，为闰年。

        提示：
        1.java.lang.Math
        2.java.util.Random*/
public class K {
    public static void main(String[] args) {
        int year;

        year=(int)(Math.random()*2000+1000);
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println(year+"为闰年");
        }else{
            System.out.println(year+"为非闰年");
        }
    }
}
