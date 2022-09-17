import java.sql.SQLOutput;
import java.util.Vector;

public class Prac_02_main {
    public static void main(String[] args) {
        Vector<Prac_02> v = new Vector<Prac_02>(2);

        for (int i = 0; i < 2; i++) {
            Prac_02 p1 = new Prac_02();
            v.add(p1);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(" answer for Index = "+ i+1);
            v.get(i).GetData();
            System.out.println("Sum = " +  v.get(i).sum());
            System.out.println("Sub = " +  v.get(i).sub());
        }
    }
}
