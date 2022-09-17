public class Prac_04 {
    void sample1(int a , int b) {
        System.out.println("In Parent class method ");
        System.out.println("a+b ="+ (a+b));
    }
}

class child extends Prac_04 {
    void sample1(int a , int b) {
        System.out.println("In child class method ");
        System.out.println("a-b =" + (a-b));

    }
}
