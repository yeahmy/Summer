/**
 * Created by Administrator on 13-7-23.
 */
public class Plane extends Vehicle {
    double weight;
    int number;

    void begin(){
        System.out.println("begining...");
    }
    public static void main(String[] args) {
        Plane plane=new Plane();
        System.out.println(plane.type);
        System.out.println(plane.weight);
        plane.begin();
    }
}
