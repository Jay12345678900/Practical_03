interface A {
    public void Details();
    default void Address() {
        System.out.println("Address: \n\tOm residency, \n\t4th floor 401, \n\tKaramsad vv nagar road, \n\tKaramsad-388325");
    }
}

public class Prac_07 implements A {
    public void Details() {
        System.out.println("Details:");
        System.out.println("Name: \t\tJay Patel");
        System.out.println("ID No.: \t21CE092");
        System.out.println("Collage name: \tCharusat(CSPIT)");
        System.out.println("Branch: \tComputer Engineering");
        System.out.println("Current Sem.: \t3");
    }

    public static void main(String []args) {
        Prac_07 p1=new Prac_07();
        p1.Details();
        p1.Address();
    }
}
