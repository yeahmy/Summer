/**
 * Created by Administrator on 13-7-22.
 */
public class B {
    public static void main(String[] args) {
        int i,j;
        for(i=2;i<1000000000;i++){
            for(j=2;j<=i;j++){
                int a=(i%j);
                if(a==0) break;    //差别为，素数可以使测试值到达与自己持平，非素数有一个a！=0即可定为非素数即应停止。将差别突出应比较测试值是否达到数据本身。
                }
            if(j==i){
                System.out.println(i);
            }
        }
    }
}
