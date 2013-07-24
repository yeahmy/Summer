/**
 * Created by Administrator on 13-7-23.
 */
 class Vehicle {
    String type;    //交通工具种类
    double volumn;  //体积
    double speed;    //速度
    String material; //材质

    /*Vehicle(String type, double volumn, double speed, String material) {
        this.type = type;
        this.volumn = volumn;
        this.speed = speed;
        this.material = material;
    }*/



    double distance(){        //距离出发点位置
        double d,t=2;        //t为驾驶时间
        d=0+t*speed;
        return d;
    }

    public static void main(String[] args){



    }

}
