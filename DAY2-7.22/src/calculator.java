/**
 * Created by Administrator on 13-7-22.
 */
public class calculator {
    public static void main(String[] args) {
        int a=7,b=5;
        System.out.println(a/b);
        int x=1,y=0;
        boolean c=(x==y&&x>++y);
        boolean e=(x!=y&&x>=++y);
        System.out.println(y);
        System.out.println(c);
        boolean d=(c^e);
        System.out.println(d);

        for(int k=0;k<10;k++){
        System.out.println(k);
        }
    }
}