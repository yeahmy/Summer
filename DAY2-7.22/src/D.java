/**
 * Created by Administrator on 13-7-22.
 */
public class D {
    public static void main(String[] args) {
        for(int a=0;a<=1000;a++){
            if (a%3==0|a%7==0){           //用while报错，因为while的条件没有不符合就跳不出来。
                System.out.println(a);
            }
        }
    }
}
