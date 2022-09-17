public class Prac_03_main {
    public static void main(String[] args) {
        Prac_03 p3 = new Prac_03();
        System.out.println("R =" + p3.R);
        System.out.println("R1 =" + p3.R1);
        System.out.println("R2 =" + p3.R2);
        System.out.println("R3 =" + p3.R3);
        p3.get();
        System.out.println( "divide = "+  p3.divide());
        System.out.println( "sum = "+  p3.sum());
        System.out.println( "sub = "+  p3.sub());
        System.out.println( "multiply = "+p3.multiply());
    }
}
