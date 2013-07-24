/**
 * Created by Administrator on 13-7-22.
 */
public class C {
    public static void main(String[] args) {
        double a,b,c,d;

        for(a=0;a<=9;a++){
            for(b=0;b<=9;b++){
                for(c=0;c<=9;c++){
                    for(d=1;d<=9;d++){
                        double x=Math.pow(a,4); //Math.pow()里面的数必须为double型。
                        double y=Math.pow(b,4);
                        double z=Math.pow(c,4);
                        double q=Math.pow(d,4);
                        if(x+y+z+q==d*1000+c*100+b*10+a){
                            System.out.println(d*1000+c*100+b*10+a);
                        }
                    }
                }
            }
        }
    }
}
