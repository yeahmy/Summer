package yeahmy.firstpacage;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-24.
 */
public class Square extends Shape {

    private double b;




    public  void getArea() {
        System.out.println("请输入数字");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        System.out.println("面积为"+i*i);


    }


    public void getPerimeter(){
        System.out.println("请再次输入数字");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        System.out.println("周长为"+4*i);

    }
    public static void main(String[] args) {
          Square square=new Square();
          square.getArea();
          square.getPerimeter();
    }




}