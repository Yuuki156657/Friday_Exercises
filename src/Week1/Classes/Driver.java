package Week1.Classes;

public class Driver {
    public static void main(String[] args) {
        Square s1 = new Square(5,7, "Blue");
        Square s2 = new Square(10,2, "Green");
        Square s3 = new Square(15,12, "Red");

        s1.draw();
        System.out.println("\n");
        s2.draw();
        System.out.println("\n");
        s3.draw();
    }
}
