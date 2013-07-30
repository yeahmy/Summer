import java.util.Random;

/**
 * Created by Administrator on 13-7-30.
 */
public class QIpan {
    public static void main(String[] args) {
        Random random=new Random();
        int size=14;
        int[][] color=new int[size][size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                color[i][j]=random.nextInt(5);
                System.out.print(color[i][j]+" ");

            }
            System.out.println();

        }
    }
}
