/**
 * Created by Administrator on 13-7-23.
 */
public class J_teacher extends J_employee{
    public int m_classhour;
    public J_teacher(){
        m_classhour=96;
    }
    public void mb_printInfor(){
        System.out.println("您的工作年限为"+m_workyear);
        System.out.println("您教学课时为"+m_classhour);
    }

    public static void main(String[] args) {
        J_employee a=new J_employee();
        a.mb_printInfor();
        a=new J_teacher();
        a.mb_printInfor();
    }

}
