package test1;

/**
 * Created by Administrator on 13-7-24.
 */
public class AbstractTest2 extends AbstractTest{

    double b;
    double s;
    double l;

    double area(){
       s=b*b;
       return s;
    }
    double per(){
        l=4*b;
        return l;
    }

    public AbstractTest2(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return s;
    }

    @Override
    public double getPerimeter() {
        return l;
    }

    public static void main(String[] args) {
        AbstractTest2 abstractTest2=new AbstractTest2(2.2);


    }
}
