import java.util.Scanner;

public class Prac_04_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int  a = sc.nextInt();
        System.out.print("Enter the second  value: ");
        int   b = sc.nextInt();

        Prac_04 p4 = new Prac_04();
        p4.sample1(a,b);

        child c4 = new child();
        c4.sample1(a,b);
    }
}
