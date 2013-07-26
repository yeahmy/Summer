package test1;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-24.
 */
public class Square {
    private double b;


    public Square(double b) {
        this.b = b;
    }

    public  double getArea() {
//        System.out.println("请输入数字");
//        Scanner scanner=new Scanner(System.in);
//        int i=scanner.nextInt();
//        System.out.println("面积为"+i*i);
        return b*b;

    }


    public double getPerimeter(){
//        System.out.println("请再次输入数字");
//        Scanner scanner=new Scanner(System.in);
//        int i=scanner.nextInt();
//        System.out.println("周长为"+4*i);
        return b*4;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double b=scanner.nextDouble();
        Square square=new Square(b);
        System.out.println(square.getArea());

    }
}
